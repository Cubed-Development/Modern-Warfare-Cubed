package com.paneedah.mwc.utils;

import com.paneedah.mwc.Tags;
import io.redstudioragnarok.redcore.logging.RedLogger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * This class defines constants for MWC.
 * <p>
 * They are automatically updated by RFG on compile time, except for the name as Gradle would remove spaces.
 */
public class ModReference {

    public static final String ID = Tags.ID;
    public static final String NAME = "Modern Warfare Cubed";
    public static final String VERSION = Tags.VERSION;
    public static final Logger LOG = LogManager.getLogger(ID);
    public static final RedLogger RED_LOG = new RedLogger(NAME, "https://linkify.cz/MWCBugReport", LOG);
}

