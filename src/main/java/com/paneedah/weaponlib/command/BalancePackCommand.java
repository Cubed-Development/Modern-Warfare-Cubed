package com.paneedah.weaponlib.command;

import com.paneedah.weaponlib.CommonModContext;
import com.paneedah.weaponlib.config.BalancePackManager;
import com.paneedah.weaponlib.config.BalancePackManager.BalancePack;
import com.paneedah.weaponlib.network.packets.BalancePackClient;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class BalancePackCommand extends TidyCompatibleCommand {

	private static final String PASTEBIN_LINK_START = "https://pastebin.com/raw/";
	
	private static final String INFO_KEY = "info";
	private static final String LIST_KEY = "list";
	private static final String LOAD_KEY = "load";
	private static final String UNLOAD_KEY = "unload";
	private static final String GENERATE_KEY = "generate";
	private static final String DOWNLOAD_KEY = "download";
	
	private static final String PASTEBIN_KEY = "pastebin";
	private static final String RAW_KEY = "raw";
	
	public BalancePackCommand() {
		super("balancepack", "Balance Pack Manager " + BalancePackManager.getPackManagerVersion());
		
		addMainOption(INFO_KEY, "Displays all balance packs in directory");
		addMainOption(LIST_KEY, "Provides info about currently loaded pack");
		addMainOption(LOAD_KEY, "Loads a balance pack", "fileName");
		addMainOption(UNLOAD_KEY, "Unloads the current balance pack");
		addMainOption(GENERATE_KEY, "Generates the default balance pack");
		addMainOption(DOWNLOAD_KEY, "Downloads a balance pack online from Pastebin or any other raw text viewer", RAW_KEY + ", " + PASTEBIN_KEY, "link/pastebin code");
		
		addSubOption(DOWNLOAD_KEY, PASTEBIN_KEY, "Gives a pastebin identifier", "code/link");
		addSubOption(DOWNLOAD_KEY, RAW_KEY, "Gives a raw link to the identifier", "link");
	
		initCommand();
	}

	@Override
	protected void executeTidyCommand(ICommandSender sender, String mainArgument, String secondArgument, String[] args) {
		File directory = BalancePackManager.getDirectory();
		switch(mainArgument) {
		case LIST_KEY:
			sendFormattedMessage(sender, "Listing balance packs:");
			int counter = 1;
			for(File file : directory.listFiles()) {
				if(file.getName().equals("index.json")) continue;
				sender.sendMessage(new TextComponentString(TextFormatting.GOLD + "(" + (counter++) + ") " + TextFormatting.GREEN + file.getName()));
			}
			return;
		case INFO_KEY:
			if(BalancePackManager.hasActiveBalancePack()) {
				BalancePack bp = BalancePackManager.getActiveBalancePack();
				sender.sendMessage(new TextComponentString(getHeader() + " Currently loaded " + TextFormatting.RED + bp.getName() + " (" + bp.getVersion() + ")"));
			} else {
				sender.sendMessage(new TextComponentString(getHeader() + " No active balance pack. Load one with " + TextFormatting.RED + "/balancepack load <filename>" + TextFormatting.WHITE + "."));
			}
			return;
		case UNLOAD_KEY:
			if(!BalancePackManager.hasActiveBalancePack()) {
				sender.sendMessage(new TextComponentString(getHeader() + " No active balance pack. Load one with " + TextFormatting.RED + "/balancepack load <filename>" + TextFormatting.WHITE + "."));
				return;
			}
			BalancePackManager.unloadBalancePack();
			sendFormattedMessage(sender, "Succesfully unloaded balance pack.");
			CommonModContext.getContext().getChannel().sendToAll(new BalancePackClient(BalancePackManager.getActiveBalancePack()));
			return;
		case LOAD_KEY:
			if(secondArgument.length() == 0) {
				sendFormattedMessage(sender, "You must specify a file name!");
				return;
			}
			
			for(File f : directory.listFiles()) {
				if(f.getName().equals(secondArgument)) {
					sender.sendMessage(new TextComponentString(getHeader() + " Loading balance pack " + TextFormatting.RED + f.getName()));
					BalancePackManager.loadBalancePack(sender, f.getName());
					CommonModContext.getContext().getChannel().sendToAll(new BalancePackClient(BalancePackManager.getActiveBalancePack()));
					
					return;
				}
			}
			
			sender.sendMessage(new TextComponentString(getHeader() + " Could not find balance pack " + TextFormatting.RED + args[1]));
			return;
		case GENERATE_KEY:
			BalancePackManager.createDefaultBalancePack();
			sender.sendMessage(new TextComponentString(getHeader() + " Generated default balance pack with name " + TextFormatting.RED + "default_pack.json" + TextFormatting.WHITE + "."));
			return;
			
		case DOWNLOAD_KEY:
			String link = "";
			if(secondArgument.length() == 0) {
				sendOptionHelp(sender, DOWNLOAD_KEY);
				return;
			} else if(secondArgument.equals(PASTEBIN_KEY)) {
				if(args.length == 0) {
					sendOptionHelp(sender, DOWNLOAD_KEY);
					return;
				}
				if(secondArgument.contains("/") && !secondArgument.contains("raw")) {
					sender.sendMessage(new TextComponentString(getHeader() + " Detected pastebin link... but you forgot to link us to the raw data!"));
					String[] split = link.split("/");
					link = PASTEBIN_LINK_START + split[split.length - 1];
					sender.sendMessage(new TextComponentString(getHeader() + " Fixed pastebin link: " + TextFormatting.RED + link));
				} else {
					// Take Pastebin code directly
					link = PASTEBIN_LINK_START + secondArgument;
				}
				
			} else if(secondArgument.equals(RAW_KEY)) {
				if(args.length == 0) {
					sendOptionHelp(sender, DOWNLOAD_KEY);
					return;
				}
				// Player has supplied a link directly
				link = args[0];
			}

			sendFormattedMessage(sender, "Fetching balance pack from link... this could take a minute.");
			
			 try {
			   String result = IOUtils.toString(new URL(link), StandardCharsets.UTF_8);
			   BalancePackManager.loadBalancePackFromString(sender, result);
			   CommonModContext.getContext().getChannel().sendToAll(new BalancePackClient(BalancePackManager.getActiveBalancePack()));
				
			 } catch (MalformedURLException e) {
				sendFormattedMessage(sender, "Failed to open URL. Malformed URL exception.");
			} catch (IOException e) {
				sendFormattedMessage(sender, "Failed to process URL. IOException.");
			}
		}
	}
}
