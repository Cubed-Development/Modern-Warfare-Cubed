package com.paneedah.mwc.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Checks {
    private static final Pattern patternName = Pattern.compile("[a-zA-Z0-9_ ]");
    private static final Pattern patternId = Pattern.compile("[a-zA-Z0-9_]");

    public static boolean checkId(String id) {
        Matcher matcher = patternId.matcher(id);
        return matcher.find();
    }

    public static boolean checkName(String name) {
        Matcher matcher = patternName.matcher(name);
        return matcher.find();
    }
}
