package com.paneedah.mwc.utils;

import com.paneedah.mwc.Tags;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * This class defines constants for MWC.
 * <p>
 * id and version are automatically updated by RFG.
 */
public class ModReference {

    public static final String id = Tags.ID;
    public static final String name = "Modern Warfare Cubed";
    public static final String version = Tags.VERSION;
    public static final Logger log = LogManager.getLogger(id);
}

