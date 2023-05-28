package com.paneedah.weaponlib.animation;

import akka.japi.Pair;
import com.paneedah.weaponlib.ModContext;
import com.paneedah.weaponlib.PlayerWeaponInstance;
import com.paneedah.weaponlib.compatibility.Interceptors;
import com.paneedah.weaponlib.compatibility.RecoilParam;
import com.paneedah.weaponlib.numerical.LerpedValue;
import com.paneedah.weaponlib.numerical.RandomVector;
import com.paneedah.weaponlib.numerical.SpringValue;
import net.minecraft.entity.player.EntityPlayer;

import static com.paneedah.mwc.proxies.ClientProxy.mc;

/**
 * Stores a bunch of values that need to update on an interval, and typically
 * have to be smooth. This class was such a tremendous mess that I would say it
 * actually in fact used negative software engineering principles.
 * 
 * 
 * @author Homer Riva-Cambrin
 * @since October 23rd, 2022
 */
public class ClientValueRepo {

	// 20 ticks/s -> 1/20 = 0.05
	private static final double DELTA_T = 0.05;

	// This value is added to the "TICKER" every tick.
	// Don't touch this as it will mess with how things
	// look.
	private static final double TICKER_INCREMENT = 0.01;

	// Movement dampening values. Essentially how fast
	// should these movement values go to zero. Lower
	// values are faster.
	private static final double RUNNING_SPEED_VALUE = 0.5;
	private static final double RUNNING_DAMPEN_VALUE = 0.6;
	private static final double FORWARD_MOVEMENT_DAMPEN_VALUE = 0.7;
	private static final double STRAFE_MOVEMENT_DAMPEN_VALUE = 0.7;

	// How fast the scope recovers from movements (used for scope
	// shadow)
	private static final double SCOPE_INTERIA_DAMPENING = 0.2f;

	// How much the jump velocity should be multiplied by to
	// do camera movements.
	private static final double JUMP_VELOCITY_MULTIPLIER = 10;

	// How much we should be dividing the forward movement by
	// for camera movements. (0.25 -> 1/4)
	private static final double FORWARD_MOVEMENT_DIVISOR = 0.25;

	// How much we should be dividing the strafe movement by
	// for camera movements. (0.50 -> 1/2)
	private static final double STRAFE_MOVEMENT_DIVISOR = 0.5;

	// Random vector parameters
	private static final double RANDOM_VECTOR_DAMPENING = 0.6;
	private static final double RANDOM_VECTOR_SPEED = 0.2;

	// We want to add extra power for initial shots, this makes it
	// so guns like snipers still have an impactful recoil.
	private static final float INITIAL_GUN_POWER_CUTOFF = 10;
	private static final float INITIAL_GUN_POWER_MULTIPLIER = 2;

	// How much we reduce recoil by once the gun stock is touching
	// the shoulder.
	private static final float GUN_POWER_PAST_STOCK_DIVISOR = 0.4f;
	
	// Divides power to add it to weapon recovery velocity
	private static final double WEAPON_RECOVERY_VELOCITY_POWER = 0.25;


	/*
	 * LERPED VALUES Values that are only updated every tick. Do not require high
	 * precision. Typically for slower movements.
	 */

	public static final LerpedValue TICKER = new LerpedValue();

	public static LerpedValue strafe = new LerpedValue();
	public static LerpedValue forward = new LerpedValue();
	public static LerpedValue running = new LerpedValue();

	// Recoil
	public static LerpedValue gunPow = new LerpedValue();

	// scope
	public static LerpedValue scopeX = new LerpedValue();
	public static LerpedValue scopeY = new LerpedValue();

	public static LerpedValue slidePumpValue = new LerpedValue();

	public static float scopeXScreen;
	public static float scopeYScreen;

	/**
	 * SPRING VALUES Simulated spring movements. Again, these are updated on tick so
	 * actually lack in high-precision movements.
	 */
	public static SpringValue xInertia = new SpringValue(4000, 20, 350);
	public static SpringValue yInertia = new SpringValue(4000, 20, 350);
	public static SpringValue jumpingSpring = new SpringValue(2000, 40, 400);
	public static SpringValue weaponRecovery = new SpringValue(50, 1, 3);

	public static RandomVector stressVec = new RandomVector();
	public static RandomVector recoilRotationVector = new RandomVector();

	public static boolean shouldContinueRunning = false;

	public static double recoilWoundY;

	
	public static void fireWeapon(PlayerWeaponInstance pwi) {

		RecoilParam params = pwi.getRecoilParameters();

		Pair<Double, Double> screenShakeParam = pwi.getScreenShakeParameters();

		double power = params.getWeaponPower();

		if (gunPow.currentValue < INITIAL_GUN_POWER_CUTOFF) {
			Interceptors.nsm.impulse(screenShakeParam.first());
			power *= INITIAL_GUN_POWER_MULTIPLIER;
		} else if (gunPow.currentValue > params.getStockLength()) {
			power *= GUN_POWER_PAST_STOCK_DIVISOR;
			Interceptors.nsm.impulse(screenShakeParam.first() * GUN_POWER_PAST_STOCK_DIVISOR);
		} else
			Interceptors.nsm.impulse(screenShakeParam.first());

		weaponRecovery.velocity += power * WEAPON_RECOVERY_VELOCITY_POWER;

		gunPow.currentValue += power;

		stressVec.callRandom(pwi.isAimed() ? 0.05 : 0.2);
		recoilRotationVector.callRandom(15);

		slidePumpValue.currentValue += 1.0;

	}

	public static void update(ModContext context) {
		// Update all of our lerped values' previous
		// values before we assign new values.
		running.updatePrevious();
		strafe.updatePrevious();
		scopeX.updatePrevious();
		scopeY.updatePrevious();
		gunPow.updatePrevious();
		forward.updatePrevious();
		TICKER.updatePrevious();
		slidePumpValue.updatePrevious();
		
		
		slidePumpValue.dampen(0.0001);
		
		
		EntityPlayer player = mc.player;

		PlayerWeaponInstance pwi = context.getMainHeldWeapon();

		// Add the ticker increment to the ticker every tick (say that
		// ten times fast!)
		TICKER.currentValue += TICKER_INCREMENT;

		
		if(!player.capabilities.isFlying && player.onGround) {
			// Update movement values
			if (!mc.player.onGround)
				jumpingSpring.velocity += mc.player.motionY * JUMP_VELOCITY_MULTIPLIER;
			if (player.moveForward < 0) {
				strafe.add(player.moveForward * FORWARD_MOVEMENT_DIVISOR);
			} else if(!player.isElytraFlying() && !player.capabilities.isFlying) {
				forward.add(player.moveForward * FORWARD_MOVEMENT_DIVISOR);
			}
			strafe.add(player.moveStrafing * STRAFE_MOVEMENT_DIVISOR);
		}
			xInertia.velocity += strafe.currentValue;

			// Update running value. Adds the running speed to
			// it if we are sprinting.
			if (player.isSprinting())
				running.add(RUNNING_SPEED_VALUE);
		
		

		strafe.dampen(STRAFE_MOVEMENT_DAMPEN_VALUE);
		forward.dampen(FORWARD_MOVEMENT_DAMPEN_VALUE);
		running.dampen(RUNNING_DAMPEN_VALUE);

		if (pwi != null) {
			// Recoil constants
			RecoilParam recoilParameters = pwi.getRecoilParameters();

			if (gunPow.currentValue > recoilParameters.getStockLength()) {
				gunPow.dampen(recoilParameters.getPowerRecoveryStockRate());
			} else
				gunPow.dampen(recoilParameters.getPowerRecoveryNormalRate());
		}

		// Update our random vectors
		recoilRotationVector.update(RANDOM_VECTOR_SPEED, RANDOM_VECTOR_DAMPENING);
		stressVec.update(RANDOM_VECTOR_SPEED, RANDOM_VECTOR_DAMPENING);

		if (pwi != null) {
			if (pwi.isAimed()) {
				scopeXScreen = 0.5F;
				scopeYScreen = 0.5F;

				// Handle scope values
				scopeX.currentValue *= SCOPE_INTERIA_DAMPENING;
				scopeY.currentValue *= SCOPE_INTERIA_DAMPENING;
			} else {
				scopeXScreen = 0.15F;
				scopeYScreen = 0.35F;

				// Makes scope shadow go bye bye if gun is
				// at resting position.
				if (scopeX.getValue() > -20)
					scopeX.add(-0.5);
				if (scopeY.getValue() < 20)
					scopeY.add(0.5);
			}
		}

		// Finally, we update our springs.
		weaponRecovery.update(DELTA_T);
		jumpingSpring.update(DELTA_T);
		xInertia.update(DELTA_T);
		yInertia.update(DELTA_T);

	}

}
