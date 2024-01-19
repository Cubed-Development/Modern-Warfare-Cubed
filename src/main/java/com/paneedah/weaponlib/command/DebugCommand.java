package com.paneedah.weaponlib.command;

import com.paneedah.mwc.MWC;
import com.paneedah.weaponlib.*;
import com.paneedah.weaponlib.animation.AnimationModeProcessor;
import com.paneedah.weaponlib.animation.DebugPositioner;
import com.paneedah.weaponlib.animation.Transform;
import com.paneedah.weaponlib.animation.jim.BBLoader;
import com.paneedah.weaponlib.render.ModificationGUI;
import com.paneedah.weaponlib.render.WeaponSpritesheetBuilder;
import com.paneedah.weaponlib.vehicle.VehiclePart;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.item.Item;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;

import java.util.ArrayList;

import static com.paneedah.mwc.proxies.ClientProxy.MC;
import static com.paneedah.mwc.utils.ModReference.ID;

public class DebugCommand extends CommandBase {

    public static boolean debugF3;

    private static final String SHOW_OPTION_CODE = "code";
    private static final String COMMAND_DEBUG = "wdb";
    private static final String DEBUG_ARG_ON = "on";
    private static final String DEBUG_ARG_OFF = "off";
    private static final String DEBUG_ARG_PAUSE = "pause";
    private static final String DEBUG_ARG_PART = "part";
    private static final String DEBUG_ARG_VPART = "vpart";
    private static final String DEBUG_ARG_SCALE = "scale";
    private static final String DEBUG_ARG_SHOW = "show";
    private static final String DEBUG_ARG_WATCH = "watch";
    private static final String DEBUG_ARG_STEP = "step";
    private static final String DEBUG_ARG_AUTOROTATE = "ar";
    private static final String DEBUG_ANIM_MODE = "anim";
    private static final String DEBUG_WEAPON = "weapon";

    private static final String DEBUG_F3 = "f3";
    
    private static final String DEBUG_FREECAM = "freecam";
    private static final String DEBUG_MUZZLE_POS = "muzzle";
    
    public static int debugFlag = 0;

    public DebugCommand() {
    }

    @Override
    public String getName() {
        return COMMAND_DEBUG;
    }
    
    public String getDebugPrefix() {
    	return TextFormatting.GOLD + "[" + TextFormatting.DARK_GRAY + "VMW DEBUG" + TextFormatting.GOLD + "] ";
    }
    
    public String getDefaultPrefix() {
    	return TextFormatting.BOLD + "" + TextFormatting.GOLD + "(" + TextFormatting.DARK_GRAY + "MWC" + TextFormatting.GOLD + ") ";
    }

    @Override
    public String getUsage(ICommandSender sender) {
        return getDebugPrefix() + "/" + COMMAND_DEBUG + " (options) or type /wdb help";
    }

    public void sendDebugMessage(String message) {
        MC.player.sendMessage(new TextComponentString(getDebugPrefix() + message));
    }
    
    private String getSubCommandDebugUsage() {
        return "/" + COMMAND_DEBUG + " <" + DEBUG_ARG_ON + "|" + DEBUG_ARG_OFF + ">";
    }

    private String getSubCommandPauseUsage() {
        return String.format("/%s %s <transition-number> <pause-duration>", COMMAND_DEBUG, DEBUG_ARG_PAUSE);
    }

    private String getSubCommandPartUsage() {
        return String.format("/%s %s main|lhand|rhand", COMMAND_DEBUG, DEBUG_ARG_PART);
    }
    
    private String getSubCommandVPartUsage() {
        return String.format("/%s %s main|lhand|rhand|swheel", COMMAND_DEBUG, DEBUG_ARG_VPART);
    }

    private String getSubCommandShowUsage() {
        return String.format("/%s %s code", COMMAND_DEBUG, DEBUG_ARG_SHOW);
    }

    private String getSubCommandScaleUsage() {
        return String.format("/%s %s <scale>", COMMAND_DEBUG, DEBUG_ARG_SCALE);
    }

    private String getSubCommandStepUsage() {
        return String.format("/%s %s <step>", COMMAND_DEBUG, DEBUG_ARG_STEP);
    }

    private String getSubCommandWatchUsage() {
        return String.format("/%s %s [entity-id]", COMMAND_DEBUG, DEBUG_ARG_WATCH);
    }
    
    private String getSubCommandAutorotateUsage() {
        return String.format("/%s %s <rpm> [x|y|z]", COMMAND_DEBUG, DEBUG_ARG_AUTOROTATE);
    }

    @Override
    public void execute(MinecraftServer server, ICommandSender sender, String[] args) {
        if (args.length > 0) {
            switch(args[0].toLowerCase()) {
            case DEBUG_ARG_ON:
                processDebugModeSubCommand(args);
                break;
            case DEBUG_ARG_OFF:
                processDebugModeSubCommand(args);
                break;
            case DEBUG_ARG_PAUSE:
                processPauseSubCommand(args);
                break;
            case DEBUG_ARG_PART:
                processWeaponPartSubCommand(args);
                break;
            case DEBUG_ARG_VPART:
                processVehiclePartSubCommand(args);
                break;
            case DEBUG_ARG_SHOW:
                processShowSubCommand(args);
                break;
            case DEBUG_ARG_SCALE:
                processScaleSubCommand(args);
                break;
            case DEBUG_ARG_STEP:
                processStepSubCommand(args);
                break;
            case DEBUG_ARG_WATCH:
                processWatchSubCommand(args);
                break;
            case DEBUG_ARG_AUTOROTATE:
                processAutorotateSubCommand(args);
                break;
            case DEBUG_FREECAM:
            	processFreecamAndMuzzleSubCommands(args);
            	break;
            case DEBUG_MUZZLE_POS:
            	processFreecamAndMuzzleSubCommands(args);
            	break;
            case DEBUG_ANIM_MODE:
            	processAnimMode(args);
            	break;
            case DEBUG_WEAPON:
            	processWeapon(args);
            	break;
            case DEBUG_F3:
                processF3();
                break;
            default:
                MC.player.sendMessage(new TextComponentString(getUsage(sender)));
            }
        } else {
            MC.player.sendMessage(new TextComponentString(getUsage(sender)));
        }
    }

    public ArrayList<String> compatList = new ArrayList<>();
    
    private static boolean isInfiniteAmmo;
    private static boolean isDebuggingActionPosition;
    private static boolean isWorkingOnScreenShake;
    private static boolean isForceLiveRenderGUI = true;
    private static boolean isEditingGUI;
    public static Transform debugSlideTransform = new Transform();
    public static Pair<Double, Double> screenShakeParam = new Pair<>(0.0, 0.0);
    
    public static boolean isDebuggingActionPosition() {
    	return isDebuggingActionPosition;
    }
    
    public static boolean isWorkingOnScreenShake() {
    	return isWorkingOnScreenShake;
    }
    
    public static boolean isInfiniteAmmo() {
    	return isInfiniteAmmo;
    }
    
    public static boolean isEditingGUI() {
    	return isEditingGUI;
    }
    
    public static boolean isForceLiveRenderGUI() {
    	return isForceLiveRenderGUI;
    }

    private void processF3() {
        debugF3 = !debugF3;

        MWC.updateDebugHandler();

        sendDebugMessage("F3 debugging is now " + (debugF3 ? "on" : "off"));
    }
    
    private void processWeapon(String[] args) {
        switch (args[1]) {
            case "infinite":
                isInfiniteAmmo = !isInfiniteAmmo;
                MC.player.sendMessage(new TextComponentString(getDebugPrefix() + " Infinite ammo mode is " + (isInfiniteAmmo ? "on" : "off")));
                break;
            case "slide":
                if (args[2].equals("edit")) {
                    isDebuggingActionPosition = !isDebuggingActionPosition;
                    MC.player.sendMessage(new TextComponentString(getDebugPrefix() + " Slide editor mode is " + (isDebuggingActionPosition ? "on" : "off")));

                } else if (args[2].equals("setpos")) {
                    double x = Double.parseDouble(args[3]);
                    double y = Double.parseDouble(args[4]);
                    double z = Double.parseDouble(args[5]);
                    debugSlideTransform.withPosition(x, y, z);
                }
                break;
            case "shake":
                if (args[2].equals("edit")) {
                    isWorkingOnScreenShake = !isWorkingOnScreenShake;
                    MC.player.sendMessage(new TextComponentString(getDebugPrefix() + " Shake editor mode is " + (isWorkingOnScreenShake ? "on" : "off")));
                } else if (args[2].equals("set")) {
                    double intensity = Double.parseDouble(args[3]);
                    double lengthModifier = Double.parseDouble(args[4]);
                    screenShakeParam = new Pair<Double, Double>(intensity, lengthModifier);
                }
                break;
            case "buildsheet":
                sendDebugMessage("Checking to see if a sprite sheet can be built...");
                WeaponSpritesheetBuilder.build();
                sendDebugMessage("Generating icon sheet as... " + TextFormatting.GREEN + " guniconsheet.png");
                break;

            case "liverender":
                if (args[2].equals("toggle")) {
                    isForceLiveRenderGUI = !isForceLiveRenderGUI;
                    sendDebugMessage("Live renderer is now " + TextFormatting.DARK_GRAY + (isForceLiveRenderGUI ? "on" : "off"));
                } else if (args[2].equals("?")) {
                    sendDebugMessage("Live renderer causes weapons to switch off of the icon sheet and directly renderer into the inventory. This should only ever be used for debugging.");
                }
                break;

            case "gui":
                if (args[2].equals("print")) {
                    sendDebugMessage("Printing locations to console (or log)");
                    ModificationGUI.getInstance().printTabLocations();
                } else {
                    isEditingGUI = !isEditingGUI;
                    sendDebugMessage("GUI editing mode: " + TextFormatting.DARK_GRAY + (isEditingGUI ? "on" : "off"));
                }
                break;

            case "debugFlag":
                debugFlag = Integer.parseInt(args[2]);
                break;
        }
    }
    
    private void processAnimMode(String[] args) {
        switch (args[1]) {
            case "on":
                if (!AnimationModeProcessor.getInstance().isLegacyMode()) {
                    AnimationModeProcessor.getInstance().setFPSMode(true);
                } else {
                    MC.player.sendMessage(new TextComponentString(getDebugPrefix() + " You cannot enter animation mode with a legacy gun!"));
                }
                break;

            case "off":
                AnimationModeProcessor.getInstance().setFPSMode(false);
                break;

            case "dh":
                BBLoader.HANDDIVISOR = Double.parseDouble(args[2]);
                MC.player.sendMessage(new TextComponentString("Hand divisor set to " + BBLoader.HANDDIVISOR));
                break;

            case "dg":
                BBLoader.GENDIVISOR = Double.parseDouble(args[2]);
                MC.player.sendMessage(new TextComponentString("General divisor set to " + BBLoader.GENDIVISOR));
                break;

            case "as":
                final double x = Double.parseDouble(args[2]);
                final double y = Double.parseDouble(args[3]);
                final double z = Double.parseDouble(args[4]);
                ClientModContext.getContext().getMainHeldWeapon().getWeapon().getRenderer().getWeaponRendererBuilder().firstPersonLeftHandTransform.withScale(x, y, z);
                break;
        }
     }
    
    private void processFreecamAndMuzzleSubCommands(String[] args) {
    	switch(args[0].toLowerCase()) {
    	case DEBUG_FREECAM:
    		if(args.length > 1 && args[1].equals("lock")) {
    			ClientEventHandler.freecamLock = !ClientEventHandler.freecamLock;
    			sendDebugMessage("Freecam lock " + TextFormatting.DARK_GRAY + (ClientEventHandler.freecamLock ? "enabled" : "disabled"));
    		} else {
    			ClientEventHandler.freecamEnabled = !ClientEventHandler.freecamEnabled;
    			sendDebugMessage("Freecam " + TextFormatting.DARK_GRAY + (ClientEventHandler.freecamEnabled ? "enabled" : "disabled"));
    		}
    		break;

    	case DEBUG_MUZZLE_POS:
    		if (ClientEventHandler.muzzlePositioner) {
                MC.player.sendMessage(new TextComponentString(getDebugPrefix() + "Exiting muzzle debug..."));
    			ClientEventHandler.muzzlePositioner = false;
      	      
    		} else {
                MC.player.sendMessage(new TextComponentString(getDebugPrefix() + "Entering muzzle debug... a point will display."));
      	      	ClientEventHandler.muzzlePositioner = true;
    		}
    		
    		 break;
    	}
    }

    private void processDebugModeSubCommand(String[] args) {
        Boolean debugMode = null;
        switch(args[0].toLowerCase()) {
        case DEBUG_ARG_ON:
            debugMode = true;
            break;
        case DEBUG_ARG_OFF:
            debugMode = false;
            break;
        }
        if(debugMode != null) {
            DebugPositioner.setDebugMode(debugMode);
            MC.player.sendMessage(new TextComponentString(getDebugPrefix() + "Debug mode " + args[0].toLowerCase()));
        } else {
            MC.player.sendMessage(new TextComponentString(getSubCommandDebugUsage()));
        }
    }

    private void processPauseSubCommand(String[] args) {
        if(args.length != 3) {
            MC.player.sendMessage(new TextComponentString(getSubCommandPauseUsage()));
            return;
        }

        try {
            int transitionNumber = Integer.parseInt(args[1]);
            long pauseDuration = Long.parseLong(args[2]);
            DebugPositioner.configureTransitionPause(transitionNumber, pauseDuration);
            MC.player.sendMessage(new TextComponentString("Set transition " + transitionNumber + " pause to " + pauseDuration + "ms"));
        } catch(NumberFormatException e) {
            MC.player.sendMessage(new TextComponentString(getSubCommandPauseUsage()));
        }
    }

    private void processWatchSubCommand(String[] args) {
        if(args.length < 1) {
            MC.player.sendMessage(new TextComponentString(getSubCommandWatchUsage()));
            return;
        }

        DebugPositioner.watch();
    }

    private void processScaleSubCommand(String[] args) {
        if(args.length != 2) {
            MC.player.sendMessage(new TextComponentString(getSubCommandScaleUsage()));
            return;
        }

        if(DebugPositioner.getDebugPart() == null) {
            MC.player.sendMessage(new TextComponentString("Debug part not selected"));
            return;
        }

        try {
            float scale = Float.parseFloat(args[1]);
            DebugPositioner.setScale(scale);
            MC.player.sendMessage(new TextComponentString("Set scale to " + scale));
        } catch(NumberFormatException e) {
            MC.player.sendMessage(new TextComponentString(getSubCommandScaleUsage()));
        }
    }
    
    private void processAutorotateSubCommand(String[] args) {
        if(args.length < 2) {
            MC.player.sendMessage(new TextComponentString(getSubCommandAutorotateUsage()));
            return;
        }

        if(DebugPositioner.getDebugPart() == null) {
            MC.player.sendMessage(new TextComponentString("Debug part not selected"));
            return;
        }

        try {
            float rpm = Float.parseFloat(args[1]);
            if(rpm < 0) {
                MC.player.sendMessage(new TextComponentString("RPM must be greater than 0"));
                return;
            }
            float xrpm = 0f;
            float yrpm = 0f;
            float zrpm = 0f;
            if(args.length >= 3) {
                switch(args[2].trim().toLowerCase()) {
                case "y":
                    yrpm = rpm;
                    break;
                case "z":
                    zrpm = rpm;
                    break;
                case "x": default:
                    xrpm = rpm;
                    break;  
                }
            } else {
                xrpm = rpm;
            }
            DebugPositioner.setAutorotate(xrpm, yrpm, zrpm);
            MC.player.sendMessage(new TextComponentString("Set autorotate to "
                    + xrpm +", " + yrpm + ", " + zrpm));
        } catch(NumberFormatException e) {
            MC.player.sendMessage(new TextComponentString(getSubCommandAutorotateUsage()));
        }
    }

    private void processStepSubCommand(String[] args) {
        if(args.length != 2) {
            MC.player.sendMessage(new TextComponentString(getSubCommandStepUsage()));
            return;
        }

        if(DebugPositioner.getDebugPart() == null) {
            MC.player.sendMessage(new TextComponentString("Debug part not selected"));
            return;
        }

        try {
            float step = Float.parseFloat(args[1]);
            DebugPositioner.setStep(step);
            MC.player.sendMessage(new TextComponentString("Set step to " + step));
        } catch(NumberFormatException e) {
            MC.player.sendMessage(new TextComponentString(getSubCommandStepUsage()));
        }
    }

    private void processShowSubCommand(String[] args) {
        if(args.length != 2) {
            MC.player.sendMessage(new TextComponentString(getSubCommandShowUsage()));
            return;
        }
        
        
        if(ClientEventHandler.muzzlePositioner) {
            MC.player.sendMessage(new TextComponentString(getDebugPrefix() + "Muzzle Position: " + ClientEventHandler.debugmuzzlePosition));
            return;
        }
        if(DebugPositioner.getDebugPart() == null) {
            MC.player.sendMessage(new TextComponentString("Debug part not selected"));
            return;
        }

        if (args[1].equalsIgnoreCase(SHOW_OPTION_CODE)) {
            DebugPositioner.showCode();
            MC.player.sendMessage(new TextComponentString("Code is copied to the console"));
        } else {
            MC.player.sendMessage(new TextComponentString(getSubCommandShowUsage()));
        }
    }

    private void processWeaponPartSubCommand(String[] args) {
        if(args.length != 2) {
            MC.player.sendMessage(new TextComponentString(getSubCommandPartUsage()));
            return;
        }

        try {
            switch(args[1].toLowerCase()) {
            case "main":
                DebugPositioner.setDebugPart(Part.MAIN_ITEM);
                break;
            case "lhand":
                DebugPositioner.setDebugPart(Part.LEFT_HAND);
                break;
            case "rhand":
                DebugPositioner.setDebugPart(Part.RIGHT_HAND);
                break;
            case "inventory":
                DebugPositioner.setDebugPart(Part.INVENTORY);
                break;
            default:
                String partName = args[1];

                Item item = Item.REGISTRY.getObject(new ResourceLocation(ID, partName));
                Part part = null;
                if(item instanceof Part) {
                    part = (Part) item;
                } else if(item instanceof ItemAttachment) {
                    part = ((ItemAttachment<?>)item).getRenderablePart();
                }
                if(part != null) {
                    DebugPositioner.setDebugPart(part);
                }
                break;
            }

            MC.player.sendMessage(new TextComponentString("Debugging part " + args[1]));
        } catch(NumberFormatException e) {
            MC.player.sendMessage(new TextComponentString(getSubCommandPartUsage()));
        }
    }
    
    private void processVehiclePartSubCommand(String[] args) {
        if(args.length != 2) {
            MC.player.sendMessage(new TextComponentString(getSubCommandVPartUsage()));
            return;
        }

        try {
            switch(args[1].toLowerCase()) {
            case "main":
                DebugPositioner.setDebugPart(VehiclePart.MAIN);
                break;
            case "lhand":
                DebugPositioner.setDebugPart(VehiclePart.LEFT_HAND);
                break;
            case "rhand":
                DebugPositioner.setDebugPart(VehiclePart.RIGHT_HAND);
                break;
            case "swheel":
                DebugPositioner.setDebugPart(VehiclePart.STEERING_WHEEL);
                break;
            case "flarm":
                DebugPositioner.setDebugPart(VehiclePart.FRONT_LEFT_CONTROL_ARM);
                break;
            case "frarm":
                DebugPositioner.setDebugPart(VehiclePart.FRONT_RIGHT_CONTROL_ARM);
                break;
            case "flwheel":
                DebugPositioner.setDebugPart(VehiclePart.FRONT_LEFT_WHEEL);
                break;
            case "frwheel":
                DebugPositioner.setDebugPart(VehiclePart.FRONT_RIGHT_WHEEL);
                break;
            case "rlwheel":
                DebugPositioner.setDebugPart(VehiclePart.REAR_LEFT_WHEEL);
                break;
            case "rrwheel":
                DebugPositioner.setDebugPart(VehiclePart.REAR_RIGHT_WHEEL);
                break;
            default:
                MC.player.sendMessage(new TextComponentString("Don't know anything about part " + args[1]));
                return;
            }

            MC.player.sendMessage(new TextComponentString("Debugging part " + args[1]));
        } catch(NumberFormatException e) {
            MC.player.sendMessage(new TextComponentString(getSubCommandVPartUsage()));
        }
    }

    @Override
    public int getRequiredPermissionLevel() {
        return 2;
    }
}
