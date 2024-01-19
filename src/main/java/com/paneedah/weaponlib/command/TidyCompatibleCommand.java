package com.paneedah.weaponlib.command;

import com.paneedah.weaponlib.Pair;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

/**
 * Base command class that allows for a pretty output, good functionality,
 * and allows for a simple command construction of:
 * [command] [subcommand] [args[]]
 * 
 * Features:
 * - Automatic help menu generation
 * - Error trapping before passing to child classes
 * - Header generation
 * 
 * @author Homer Riva-Cambrin, 2022
 */
public abstract class TidyCompatibleCommand extends CommandBase {
	
	private String name, usage, displayName;
	private String[] help;
	 
	private static final TextFormatting ERROR_COLOR = TextFormatting.RED;
	
	protected static final String HELP_KEY = "help";
	
	private TextFormatting primaryColor = TextFormatting.GOLD;
	private TextFormatting secondaryColor = TextFormatting.GRAY;
	private TextFormatting displayColor = TextFormatting.YELLOW;
	
	
	private HashMap<String, Pair<CommandInfo, ArrayList<Pair<String, CommandInfo>>>> tree = new HashMap<>();

	
	private static class CommandInfo {
		public String name;
		public String[] arguments;
		public String description;
		
		public CommandInfo(String name, String desc, String...arguments) {
			this.name = name;
			this.description = desc;
			this.arguments = arguments;
		}
		
	}
	
	public TidyCompatibleCommand(String name, String displayName) {
		this.name = name;
		this.displayName = displayName;
		addMainOption(HELP_KEY, "provides help");
	}
	
	public TextFormatting getPrimaryColor() {
		return primaryColor;
	}
	
	public TextFormatting getSecondaryColor() {
		return secondaryColor;
	}
	
	public TextFormatting getErrorColor() {
		return ERROR_COLOR;
	}
	
	public TextFormatting getDisplayColor() {
		return displayColor;
	}
	
	protected void initCommand() {
		
		// Generate usage
		this.usage = ERROR_COLOR + "/" + name + " ";
		if(tree.size() != 0) {
			this.usage += "<";
			Iterator<String> itr = tree.keySet().iterator();
			while(itr.hasNext()) {
				this.usage += itr.next();
				if(itr.hasNext()) this.usage += ", ";
			}
			this.usage += ">";
		}
		
		// Generate help
		int index = 0;
		this.help = new String[tree.size() + 1];
		help[index++] = getHeader() + " Options:";
		for(Entry<String, Pair<CommandInfo, ArrayList<Pair<String, CommandInfo>>>> e : tree.entrySet()) {
		
			help[index] = this.primaryColor + e.getKey();
			for(String arg : e.getValue().getFirst().arguments) {
				help[index] += this.primaryColor + " [" + arg + this.primaryColor + "]";
			}
			help[index] += " - " + this.secondaryColor + e.getValue().getFirst().description;
			
			
			index++;
		}
		
	}
	
	
	
	public void addMainOption(String main, String descriptor, String...args) {
		if(main == null) return;
		if(descriptor == null) descriptor = "";
		CommandInfo comInfo = new CommandInfo(main, descriptor, args);
		if(!tree.containsKey(main)) tree.put(main, new Pair<TidyCompatibleCommand.CommandInfo, ArrayList<Pair<String,CommandInfo>>>(comInfo, new ArrayList<>()));
	}
	
	public void addSubOption(String mainOption, String subOption, String description, String...args) {
		if(!tree.containsKey(mainOption)) return;
		CommandInfo comInfo = new CommandInfo(subOption, description, args);
		tree.get(mainOption).second().add(new Pair<String, CommandInfo>(subOption, comInfo));
	}

	@Override
	public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {

		
		if(args.length == 0) {
			sender.sendMessage(new TextComponentString(getUsage(sender)));
			return;
		}
		
		
		if(args.length > 0) {
			
			
			if(args.length == 1 && !this.tree.containsKey(args[0])) {				
				sender.sendMessage(new TextComponentString(getUsage(sender)));
				return;
			} 
			
			
			
			if(args[0].equals(HELP_KEY)) {
				sendHelp(sender);
				return;
			}
			
			
			
			String[] truncatedArray = null;
			if(args.length <= 2) {
				truncatedArray = new String[0];
			} else {
				truncatedArray = new String[args.length - 2];
				System.arraycopy(args, 1, truncatedArray, 0, truncatedArray.length);
			}
			
			executeTidyCommand(sender, args[0], args.length > 1 ? args[1] : "", truncatedArray);
		}
		
	}
	
	protected abstract void executeTidyCommand(ICommandSender sender, String mainArgument, String secondArgument, String[] args);


	
	
	
	public boolean checkForSecondaryArgument(String arg0, String arg1) {
		if(!this.tree.containsKey(arg0)) {
			return false;
		} else {
		
			for(Pair<String, CommandInfo> str : this.tree.get(arg0).getSecond()) {
				if(str.getFirst().equals(arg1)) return true;
			}
			return false;
		}
 	}
	
	public String getHeader() {
		return primaryColor + "(" + this.displayName + ")" + this.secondaryColor;
	}
	
	public void sendHelp(ICommandSender sender) {
		for(String line : this.help) {
			sender.sendMessage(new TextComponentString(line));
		}
	}
	
	public void sendFormattedMessage(ICommandSender sender, String contents) {
		sender.sendMessage(new TextComponentString(getHeader() + " " + contents));
	}
	
	public void sendNormalMessage(ICommandSender sender, String contents) {
		sender.sendMessage(new TextComponentString(contents));
	}
	
	
	public void sendOptionHelp(ICommandSender sender, String option) {
		
		ArrayList<Pair<String, CommandInfo>> result = this.tree.get(option).getSecond();
		sendFormattedMessage(sender, "For command " + option);
		for(Pair<String, CommandInfo> pair : result) {
			
			String string = this.primaryColor + pair.getFirst();
			for(String arg : pair.getSecond().arguments) {
				string += this.primaryColor + " [" + arg + "]";
			}
			string += " - " + this.secondaryColor + pair.getSecond().description;
			
			sender.sendMessage(new TextComponentString(string));
		}
	
	}
	

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getUsage(ICommandSender sender) {
		return this.usage;
	}

}
