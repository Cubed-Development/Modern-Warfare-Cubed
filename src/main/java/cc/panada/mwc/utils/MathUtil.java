package cc.panada.mwc.utils;

import net.jafama.FastMath;

import static cc.panada.mwc.utils.ModReference.MWC_LOG;

/**
 * This class provides fast focused mathematical methods.
 * <p>
 * By Red Studio
 * <p>
 * Created & Maintained by Desoroxxx
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
	public static float clampMinFirst(final float input, final float min, final float max) {
		return input < min ? min : Math.min(input, max);
	}

	/**
	 * Clamps a value within a specified range, checking for the maximum value first.
	 *
	 * @param input The input value to clamp
	 * @param min The minimum value to clamp to
	 * @param max The maximum value to clamp to
	 * @return The clamped value
	 */
	public static float clampMaxFirst(final float input, final float min, final float max) {
		return input > max ? max : Math.max(input, min);
	}

	/**
	 * Clamps a value within a specified range and logs a message indicating whether the value was clamped and which way was it clamped.
	 *
	 * @param input The input value to clamp
	 * @param min The minimum value to clamp to
	 * @param max The maximum value to clamp to
	 * @return The clamped value
	 */
	public static float clampTest(final float input, final float min, final float max) {
		if (input < min) {
			MWC_LOG.info("Clamped to minimum");
			return min;
		} else if (input > max) {
			MWC_LOG.info("Clamped to maximum");
			return max;
		} else {
			MWC_LOG.info("Did not clamp");
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
	public static float absolute(final float input) {
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
	public static float absoluteMax(final float input1, final float input2) {
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
	public static float addOrSubtractBasedOnSign(final float input, final float add) {
		return input < 0 ? input - add : input + add;
	}

	/**
	 * Rounds a floating-point number to the specified number of decimal places.
	 *
	 * @param input The floating-point number to round.
	 * @param decimals The number of decimal places to round to.
	 * @return The rounded number.
	 */
	public static float round(final float input, final int decimals) {
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
	public static int boolToInt(final boolean input) {
		return input ? 1 : 0;
	}
}
