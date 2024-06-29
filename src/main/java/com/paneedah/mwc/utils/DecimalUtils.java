package com.paneedah.mwc.utils;

/**
 * @author Luna Lage (Desoroxxx)
 * @since 0.1
 */
public final class DecimalUtils {
    
    // ! TODO: Move this to Red Core

    public static String truncateDecimalPlaces(final float input, final int decimalPlaces) {
        return truncateDecimalPlaces(String.valueOf(input), decimalPlaces);
    }

    public static String truncateDecimalPlaces(final double input, final int decimalPlaces) {
        return truncateDecimalPlaces(String.valueOf(input), decimalPlaces);
    }

    public static String truncateDecimalPlaces(final String input, final int decimalPlaces) {
        if (decimalPlaces < 0)
            throw new IllegalArgumentException("Number of decimal places must be non-negative");

        final int decimalIndex = input.indexOf(".");

        if (decimalIndex == -1 || input.length() <= decimalIndex + decimalPlaces)
            return input;

        return input.substring(0, decimalIndex + decimalPlaces + 1);
    }
}
