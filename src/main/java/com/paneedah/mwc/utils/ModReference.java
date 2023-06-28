package com.paneedah.mwc.utils;

import com.paneedah.mwc.Tags;
import io.redstudioragnarok.redcore.logging.RedLogger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.net.URI;

/**
 * This class defines constants for MWC.
 * <p>
 * ID and VERSION are automatically updated by RFG.
 */
public class ModReference {

    public static final String ID = Tags.ID;
    public static final String NAME = "Modern Warfare Cubed";
    public static final String VERSION = Tags.VERSION;
    public static final Logger LOG = LogManager.getLogger(ID);

    public static URI NEW_ISSUE_URL;
    public static RedLogger RED_LOG;

    static {
        try {
            NEW_ISSUE_URL = new URI("https://linkify.cz/MWCBugReport");

            RED_LOG = new RedLogger(NAME, NEW_ISSUE_URL, LOG);
        } catch (Exception ignored) {
        }
    }
}

