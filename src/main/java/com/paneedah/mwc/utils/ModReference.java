package com.paneedah.mwc.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * This class defines constants for MWC.
 * <p>
 * They are automatically updated by Gradle on compile time.
 */
public class ModReference {

    public static final String id = "@ID@";
    public static final String name = "@NAME@";
    public static final String version = "@VERSION@";
    public static final Logger log = LogManager.getLogger(id);
}

