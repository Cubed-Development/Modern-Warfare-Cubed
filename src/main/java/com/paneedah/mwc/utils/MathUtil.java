package com.paneedah.mwc.utils;

import net.jafama.FastMath;

import static com.paneedah.mwc.utils.ModReference.log;

/**
 * This class provides fast focused mathematical methods.
 * @author Desoroxxx
 */
public class MathUtil {

	private static float absolute1;
	private static float absolute2;

	private static int rounded;

	/**
	 * Clamps a value within a specified range, checking for the minimum value first.
	 *
	 * @param input The input value to clamp
	 * @param min The minimum value to clamp to
	 * @param max The maximum value to clamp to
	 * @return The clamped value
	 */
	public static float clampMinFirst(float input, float min, float max) {
		return input < min ? min : input > max ? max : input;
	}

	/**
	 * Clamps a value within a specified range, checking for the maximum value first.
	 *
	 * @param input The input value to clamp
	 * @param min The minimum value to clamp to
	 * @param max The maximum value to clamp to
	 * @return The clamped value
	 */
	public static float clampMaxFirst(float input, float min, float max) {
		return input > max ? max : input < min ? min : input;
	}

	/**
	 * Clamps a value within a specified range and logs a message indicating whether the value was clamped and which way was it clamped.
	 *
	 * @param input The input value to clamp
	 * @param min The minimum value to clamp to
	 * @param max The maximum value to clamp to
	 * @return The clamped value
	 */
	public static float clampTest(float input, float min, float max) {
		if (input < min) {
			log.info("Clamped to minimum");
			return min;
		} else if (input > max) {
			log.info("Clamped to maximum");
			return max;
		} else {
			log.info("Did not clamp");
			return input;
		}
	}

	/**
	 * Returns the absolute value of a float number.
	 * <p>
	 * The absolute value of a number is the number without its sign, so it is always a positive number.
	 *
	 * @param input The float number to get the absolute value of
	 * @return The absolute value of the input
	 */
	public static float absolute(float input) {
		return input >= 0 ? input : -input;
	}

	/**
	 * Returns the absolute maximum of two float numbers.
	 * <p>
	 * The absolute value of a number is the number without its sign, so it is always a positive number.
	 *
	 * @param input1 The first input
	 * @param input2 The second input
	 * @return The absolute maximum of the two inputs
	 */
	public static float absoluteMax(float input1, float input2) {
		absolute1 = input1 >= 0 ? input1 : -input1;
		absolute2 = input2 >= 0 ? input2 : -input2;
		return Math.max(absolute1, absolute2);
	}

	/**
	 * Adds or subtracts a value based on the sign of the input value.
	 * If the input value is less than 0.0, the add value will be subtracted from the input value.
	 * Otherwise, the add value will be added to the input value.
	 *
	 * @param input The input value.
	 * @param add The value to add or subtract.
	 * @return The result of adding or subtracting the add value from the input value.
	 */
	public static float addOrSubtractBasedOnSign(float input, float add) {
		return input < 0 ? input - add : input + add;
	}

	/**
	 * Rounds a floating-point number to the specified number of decimal places.
	 *
	 * @param input The floating-point number to round.
	 * @param decimals The number of decimal places to round to.
	 * @return The rounded number.
	 */
	public static float round(float input, int decimals) {
		// Convert input to an integer by multiplying it by 10^decimals and rounding it
		rounded = (int) FastMath.round(input * FastMath.pow(10, decimals));
        // Divide the rounded number by 10^decimals to get the rounded result
		return (float) ((rounded) / FastMath.pow(10, decimals));
	}

	/**
	 * Converts a boolean value to an integer.
	 *
	 * @param input The boolean value to convert
	 * @return 1 if the input is true, 0 if the input is false
	 */
	public static int boolToInt(boolean input) {
		return input ? 1 : 0;
	}
}
