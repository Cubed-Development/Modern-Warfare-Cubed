package cc.panada.MWC.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.net.URI;
import java.net.URISyntaxException;

public class ModReference {


    public static final String MOD_ID = "MWC";
    public static final String NAME = "Modern Warfare Cubed";
    public static final String VERSION = "@VERSION@";
    public static final Logger MWC_LOG = LogManager.getLogger(MOD_ID);
    public static URI ISSUE;

    static {
        try {
            ISSUE = new URI("https://github.com/Paneedah/Modern-Warfare-Cubed/issues/new?assignees=&labels=Minor+Bug&template=bug_report.md&title=%5BBUG%5D+%7Benter+title+here%7D");
        } catch (URISyntaxException e) {
            // TODO: (Debug Mode) This should count to the problem counter and should output a stack trace
        }
    }
}
