package com.paneedah.mwc.weaponlib.command;

import com.paneedah.mwc.weaponlib.crafting.CraftingFileManager;
import com.paneedah.mwc.weaponlib.crafting.CraftingRegistry;
import net.minecraft.command.ICommandSender;

public class CraftingFileCommand extends TidyCompatibleCommand {

	private static final String RELOAD_KEY = "reload";
	private static final String STATUS_KEY = "status";
	
	public CraftingFileCommand() {
		super("mwccraftingmanager", "MWC Crafting Manager");
		addMainOption(RELOAD_KEY, "Reloads the current crafting setup");
		addMainOption(STATUS_KEY, "Provides current crafting file manager status");
		initCommand();
	}
	
	@Override
	protected void executeTidyCommand(ICommandSender sender, String mainArgument, String secondArgument,
			String[] args) {
		
		
		
		switch (mainArgument) {
		case RELOAD_KEY:
			sendFormattedMessage(sender, "Reloading crafting file...");
			CraftingRegistry.clearRegistry();
			CraftingFileManager.getInstance().loadDirectory();
			sendFormattedMessage(sender, "Succesfully reloaded crafting file!");
			return;
		case STATUS_KEY:
			
			int load = CraftingFileManager.getInstance().getLoadingStatus();
			
			sendFormattedMessage(sender, "Crafting file manager status:");
			sendNormalMessage(sender, getSecondaryColor() + "File loaded: " + getDisplayColor() + (load != -1));
			if(load != -1) sendNormalMessage(sender, getSecondaryColor() + "File hash: " + getDisplayColor() + CraftingFileManager.getInstance().getCurrentFileHash());
			
			sendNormalMessage(sender, getSecondaryColor() + "Using custom recipes: " + getDisplayColor() + (load != -1 ? (load == 2 ? "CUSTOM" : "DEFAULT") : ""));
			
			
			return;
		}
		
	}

}
