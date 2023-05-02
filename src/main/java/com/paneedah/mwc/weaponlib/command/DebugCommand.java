package com.paneedah.mwc.weaponlib.command;

import akka.japi.Pair;
import com.paneedah.mwc.weaponlib.ClientModContext;
import com.paneedah.mwc.weaponlib.ItemAttachment;
import com.paneedah.mwc.weaponlib.Part;
import com.paneedah.mwc.weaponlib.animation.AnimationModeProcessor;
import com.paneedah.mwc.weaponlib.animation.DebugPositioner;
import com.paneedah.mwc.weaponlib.animation.Transform;
import com.paneedah.mwc.weaponlib.animation.jim.BBLoader;
import com.paneedah.mwc.weaponlib.compatibility.CompatibleClientEventHandler;
import com.paneedah.mwc.weaponlib.compatibility.CompatibleCommand;
import com.paneedah.mwc.weaponlib.compatibility.graph.CompatibilityClassGenerator;
import com.paneedah.mwc.weaponlib.render.ModificationGUI;
import com.paneedah.mwc.weaponlib.render.WeaponSpritesheetBuilder;
import com.paneedah.mwc.weaponlib.vehicle.VehiclePart;
import net.minecraft.command.ICommandSender;
import net.minecraft.item.Item;
import net.minecraft.util.text.TextFormatting;

import java.io.*;
import java.lang.reflect.Method;
import java.util.ArrayList;

import static com.paneedah.mwc.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class DebugCommand extends CompatibleCommand {

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
    
    private static final String DEBUG_FREECAM = "freecam";
    private static final String DEBUG_MUZZLE_POS = "muzzle";
    private static final String DEBUG_COMPAT = "compat";

    
    public static int debugFlag = 0;

    public DebugCommand() {
    }

    @Override
    public String getCompatibleName() {
        return COMMAND_DEBUG;
    }
    
    public String getDebugPrefix() {
    	return TextFormatting.GOLD + "[" + TextFormatting.DARK_GRAY + "VMW DEBUG" + TextFormatting.GOLD + "] ";
    }
    
    public String getDefaultPrefix() {
    	return TextFormatting.BOLD + "" + TextFormatting.GOLD + "(" + TextFormatting.DARK_GRAY + "MWC" + TextFormatting.GOLD + ") ";
    }

    @Override
    public String getCompatibleUsage(ICommandSender sender) {
        return getDebugPrefix() + "/" + COMMAND_DEBUG + " (options) or type /wdb help";
    }

    public void sendDebugMessage(String message) {
    	compatibility.addChatMessage(compatibility.clientPlayer(), getDebugPrefix() + message);
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
    public void execCommand(ICommandSender sender, String[] args) {
    	
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
            case DEBUG_COMPAT:
            	processCompatMode(args);
            	break;
            case DEBUG_WEAPON:
            	processWeapon(args);
            	break;
            default:
                compatibility.addChatMessage(compatibility.clientPlayer(), getCompatibleUsage(sender));
            }
        } else {
            compatibility.addChatMessage(compatibility.clientPlayer(), getCompatibleUsage(sender));
        }
    }
    
    public CompatibilityClassGenerator ccg = new CompatibilityClassGenerator();
    public ArrayList<String> compatList = new ArrayList<>();
    
    private static boolean isInfiniteAmmo;
    private static boolean isDebuggingActionPosition;
    private static boolean isWorkingOnScreenShake;
    private static boolean isForceLiveRenderGUI;
    private static boolean isEditingGUI;
    public static Transform debugSlideTransform = new Transform();
    public static Pair<Double, Double> screenShakeParam = new Pair<Double, Double>(0.0, 0.0);
    
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
    
    private void processWeapon(String[] args) {
    	if(args[1].equals("infinite")) {
    		isInfiniteAmmo = !isInfiniteAmmo;
    		compatibility.addChatMessage(compatibility.clientPlayer(), getDebugPrefix() + " Infinite ammo mode is " + (isInfiniteAmmo ? "on" : "off"));
        	
    	} else if(args[1].equals("slide")) {
    		if(args[2].equals("edit")) {
    			isDebuggingActionPosition = !isDebuggingActionPosition;
    			compatibility.addChatMessage(compatibility.clientPlayer(), getDebugPrefix() + " Slide editor mode is " + (isDebuggingActionPosition ? "on" : "off"));
            	
    		}else if(args[2].equals("setpos")) {
    			double x = Double.parseDouble(args[3]);
    			double y = Double.parseDouble(args[4]);
    			double z = Double.parseDouble(args[5]);
    			debugSlideTransform.withPosition(x, y, z);
    		}
    	} else if(args[1].equals("shake")) {
    		if(args[2].equals("edit")) {
    			isWorkingOnScreenShake = !isWorkingOnScreenShake;
    			compatibility.addChatMessage(compatibility.clientPlayer(), getDebugPrefix() + " Shake editor mode is " + (isWorkingOnScreenShake ? "on" : "off"));
    		} else if(args[2].equals("set")) {
    			double intensity = Double.parseDouble(args[3]);
    			double lengthModifier = Double.parseDouble(args[4]);
    			screenShakeParam = new Pair<Double, Double>(intensity, lengthModifier);
    		}
    	} else if(args[1].equals("buildsheet")) {
    		
    		sendDebugMessage("Checking to see if a sprite sheet can be built...");
    		
    		WeaponSpritesheetBuilder.build();
    		
    		sendDebugMessage("Generating icon sheet as... " + TextFormatting.GREEN + " guniconsheet.png");
    	
    		
    	} else if(args[1].equals("liverender")) {
    		if(args[2].equals("toggle")) {
    			isForceLiveRenderGUI = !isForceLiveRenderGUI;
    			sendDebugMessage("Live render is now " + TextFormatting.DARK_GRAY + (isForceLiveRenderGUI ? "on" : "off"));
    		} else if(args[2].equals("?")) {
    			sendDebugMessage("Live render causes weapons to switch off of the icon sheet and directly render into the inventory. This should only ever be used for debugging.");
    			//LayerBipedArmor
    		}
    		
    	} else if(args[1].equals("gui")) {
    		if(args[2].equals("print")) {
    			sendDebugMessage("Printing locations to console (or log)");
    			
    			 ModificationGUI.getInstance().printTabLocations();
    		} else {
    			isEditingGUI = !isEditingGUI;
        		sendDebugMessage("GUI editing mode: " + TextFormatting.DARK_GRAY + (isEditingGUI ? "on" : "off"));
    			
    		}
    		
    	} else if(args[1].equals("debugFlag")) {
    		debugFlag = Integer.parseInt(args[2]);
    	}
    }
    
    private void processCompatMode(String[] args) {
    	if(args[1].equals("new")) {
    		compatList.clear();
    		ccg.setup();
    		compatibility.addChatMessage(compatibility.clientPlayer(), getDebugPrefix() + " Started writing new compat method set");
    	} else if(args[1].equals("add")) {
    		ArrayList<Pair<Class<?>, Method>> list = ccg.findStandardOpenGLMethod(args[2]);
    		for(Pair<Class<?>, Method> pair : list) {
    			//ccg.buildOutMethod(original, searchTerm)
    			compatList.add(ccg.buildOutMethod(pair, args[2]).toString());
    		}
    	} else if(args[1].equals("build")) {
    		File f = new File("debugcompat\\output.txt");
    		System.out.println(f.getAbsolutePath());
    		try {
				f.createNewFile();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
    		f.mkdirs();
    		try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		try {
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(f));
				for(String s : compatList) {
					bos.write(s.getBytes());
				}
				bos.close();
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    }
    
    private void processAnimMode(String[] args) {
    	if(args[1].equals("on")) {
    		
    		if(!AnimationModeProcessor.getInstance().isLegacyMode()) {
    			AnimationModeProcessor.getInstance().setFPSMode(true);
    		
    		} else {
    			compatibility.addChatMessage(compatibility.clientPlayer(), getDebugPrefix() + " You cannot enter animation mode with a legacy gun!");
    	    	
    			
    		}
    		
    	} else if(args[1].equals("off")) {
    		AnimationModeProcessor.getInstance().setFPSMode(false);
    	} else if(args[1].equals("dh")) {
    		BBLoader.HANDDIVISOR = Double.parseDouble(args[2]);
    		compatibility.addChatMessage(compatibility.clientPlayer(), "Hand divisor set to " + BBLoader.HANDDIVISOR);
    	}else if(args[1].equals("dg")) {
    		BBLoader.GENDIVISOR = Double.parseDouble(args[2]);
    		compatibility.addChatMessage(compatibility.clientPlayer(), "General divisor set to " + BBLoader.GENDIVISOR);
    	} else if(args[1].equals("as")) {
    		double x = Double.parseDouble(args[2]);
    		double y = Double.parseDouble(args[3]);
    		double z = Double.parseDouble(args[4]);
    		
    		ClientModContext.getContext().getMainHeldWeapon().getWeapon().getRenderer().getWeaponRendererBuilder().firstPersonLeftHandTransform.withScale(x, y, z);
    	
    }
     }
    
    private void processFreecamAndMuzzleSubCommands(String[] args) {
    	switch(args[0].toLowerCase()) {
    	case DEBUG_FREECAM:
    		if(args.length > 1 && args[1].equals("lock")) {
    			CompatibleClientEventHandler.freecamLock = !CompatibleClientEventHandler.freecamLock;
    			sendDebugMessage("Freecam lock " + TextFormatting.DARK_GRAY + (CompatibleClientEventHandler.freecamLock ? "enabled" : "disabled"));
    			
    		} else {
    			
    			CompatibleClientEventHandler.freecamEnabled = !CompatibleClientEventHandler.freecamEnabled;
    			sendDebugMessage("Freecam " + TextFormatting.DARK_GRAY + (CompatibleClientEventHandler.freecamEnabled ? "enabled" : "disabled"));
    			
    		
    		}
    		
    		 
    		break;
    	case DEBUG_MUZZLE_POS:
    		 
    		if(CompatibleClientEventHandler.muzzlePositioner) {
    			compatibility.addChatMessage(compatibility.clientPlayer(), getDebugPrefix() + "Exiting muzzle debug...");
    			CompatibleClientEventHandler.muzzlePositioner = false;
      	      
    		} else {
    			compatibility.addChatMessage(compatibility.clientPlayer(), getDebugPrefix() + "Entering muzzle debug... a point will display.");
      	      	CompatibleClientEventHandler.muzzlePositioner = true;
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
            compatibility.addChatMessage(compatibility.clientPlayer(), getDebugPrefix() + "Debug mode " + args[0].toLowerCase());
        } else {
            compatibility.addChatMessage(compatibility.clientPlayer(), getSubCommandDebugUsage());
        }
    }

    private void processPauseSubCommand(String[] args) {
        if(args.length != 3) {
            compatibility.addChatMessage(compatibility.clientPlayer(), getSubCommandPauseUsage());
            return;
        }

        try {
            int transitionNumber = Integer.parseInt(args[1]);
            long pauseDuration = Long.parseLong(args[2]);
            DebugPositioner.configureTransitionPause(transitionNumber, pauseDuration);
            compatibility.addChatMessage(compatibility.clientPlayer(), "Set transition "
                    + transitionNumber + " pause to " + pauseDuration + "ms");
        } catch(NumberFormatException e) {
            compatibility.addChatMessage(compatibility.clientPlayer(), getSubCommandPauseUsage());
        }
    }

    private void processWatchSubCommand(String[] args) {
        if(args.length < 1) {
            compatibility.addChatMessage(compatibility.clientPlayer(), getSubCommandWatchUsage());
            return;
        }

        DebugPositioner.watch();
    }

    private void processScaleSubCommand(String[] args) {
        if(args.length != 2) {
            compatibility.addChatMessage(compatibility.clientPlayer(), getSubCommandScaleUsage());
            return;
        }

        if(DebugPositioner.getDebugPart() == null) {
            compatibility.addChatMessage(compatibility.clientPlayer(), "Debug part not selected");
            return;
        }

        try {
            float scale = Float.parseFloat(args[1]);
            DebugPositioner.setScale(scale);
            compatibility.addChatMessage(compatibility.clientPlayer(), "Set scale to " + scale);
        } catch(NumberFormatException e) {
            compatibility.addChatMessage(compatibility.clientPlayer(), getSubCommandScaleUsage());
        }
    }
    
    private void processAutorotateSubCommand(String[] args) {
        if(args.length < 2) {
            compatibility.addChatMessage(compatibility.clientPlayer(), getSubCommandAutorotateUsage());
            return;
        }

        if(DebugPositioner.getDebugPart() == null) {
            compatibility.addChatMessage(compatibility.clientPlayer(), "Debug part not selected");
            return;
        }

        try {
            float rpm = Float.parseFloat(args[1]);
            if(rpm < 0) {
                compatibility.addChatMessage(compatibility.clientPlayer(), "RPM must be greater than 0");
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
            compatibility.addChatMessage(compatibility.clientPlayer(), "Set autorotate to " 
                    + xrpm +", " + yrpm + ", " + zrpm);
        } catch(NumberFormatException e) {
            compatibility.addChatMessage(compatibility.clientPlayer(), getSubCommandAutorotateUsage());
        }
    }

    private void processStepSubCommand(String[] args) {
        if(args.length != 2) {
            compatibility.addChatMessage(compatibility.clientPlayer(), getSubCommandStepUsage());
            return;
        }

        if(DebugPositioner.getDebugPart() == null) {
            compatibility.addChatMessage(compatibility.clientPlayer(), "Debug part not selected");
            return;
        }

        try {
            float step = Float.parseFloat(args[1]);
            DebugPositioner.setStep(step);
            compatibility.addChatMessage(compatibility.clientPlayer(), "Set step to " + step);
        } catch(NumberFormatException e) {
            compatibility.addChatMessage(compatibility.clientPlayer(), getSubCommandStepUsage());
        }
    }

    private void processShowSubCommand(String[] args) {
        if(args.length != 2) {
            compatibility.addChatMessage(compatibility.clientPlayer(), getSubCommandShowUsage());
            return;
        }
        
        
        if(CompatibleClientEventHandler.muzzlePositioner) {
        	compatibility.addChatMessage(compatibility.clientPlayer(), getDebugPrefix() + "Muzzle Position: " + CompatibleClientEventHandler.debugmuzzlePosition);
            return;
        }
        if(DebugPositioner.getDebugPart() == null) {
            compatibility.addChatMessage(compatibility.clientPlayer(), "Debug part not selected");
            return;
        }

        switch(args[1].toLowerCase()) {
        case SHOW_OPTION_CODE:
            DebugPositioner.showCode();
            compatibility.addChatMessage(compatibility.clientPlayer(), "Code is copied to the console");
            break;
        default:
            compatibility.addChatMessage(compatibility.clientPlayer(), getSubCommandShowUsage());
        }
    }

    private void processWeaponPartSubCommand(String[] args) {
        if(args.length != 2) {
            compatibility.addChatMessage(compatibility.clientPlayer(), getSubCommandPartUsage());
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

                Item item = compatibility.findItemByName(partName);
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

            compatibility.addChatMessage(compatibility.clientPlayer(), "Debugging part " + args[1]);
        } catch(NumberFormatException e) {
            compatibility.addChatMessage(compatibility.clientPlayer(), getSubCommandPartUsage());
        }
    }
    
    private void processVehiclePartSubCommand(String[] args) {
        if(args.length != 2) {
            compatibility.addChatMessage(compatibility.clientPlayer(), getSubCommandVPartUsage());
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
                compatibility.addChatMessage(compatibility.clientPlayer(), "Don't know anything about part " + args[1]);
                return;
            }

            compatibility.addChatMessage(compatibility.clientPlayer(), "Debugging part " + args[1]);
        } catch(NumberFormatException e) {
            compatibility.addChatMessage(compatibility.clientPlayer(), getSubCommandVPartUsage());
        }
    }

    @Override
    public int getRequiredPermissionLevel() {
        return 0;
    }
}
