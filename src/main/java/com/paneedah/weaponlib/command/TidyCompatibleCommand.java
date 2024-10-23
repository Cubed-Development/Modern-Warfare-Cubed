package com.paneedah.weaponlib.command;

import com.paneedah.weaponlib.Pair;
import lombok.Getter;
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
 * <p>
 * Features:
 * - Automatic help menu generation
 * - Error trapping before passing to child classes
 * - Header generation
 *
 * @author Homer Riva-Cambrin, 2022
 */
public abstract class TidyCompatibleCommand extends CommandBase {

    private final String name;
    private String usage;
    private final String displayName;
    private String[] help;

    private static final TextFormatting ERROR_COLOR = TextFormatting.RED;

    protected static final String HELP_KEY = "help";

    @Getter
    private final TextFormatting primaryColor = TextFormatting.GOLD;
    @Getter
    private final TextFormatting secondaryColor = TextFormatting.GRAY;
    @Getter
    private final TextFormatting displayColor = TextFormatting.YELLOW;


    private final HashMap<String, Pair<CommandInfo, ArrayList<Pair<String, CommandInfo>>>> tree = new HashMap<>();


    private static class CommandInfo {
        public String name;
        public String[] arguments;
        public String description;

        public CommandInfo(String name, String desc, String... arguments) {
            this.name = name;
            description = desc;
            this.arguments = arguments;
        }

    }

    public TidyCompatibleCommand(String name, String displayName) {
        this.name = name;
        this.displayName = displayName;
        addMainOption(HELP_KEY, "provides help");
    }

    public TextFormatting getErrorColor() {
        return ERROR_COLOR;
    }

    protected void initCommand() {

        // Generate usage
        usage = ERROR_COLOR + "/" + name + " ";
        if (!tree.isEmpty()) {
            usage += "<";
            Iterator<String> itr = tree.keySet().iterator();
            while (itr.hasNext()) {
                usage += itr.next();
                if (itr.hasNext()) {
                    usage += ", ";
                }
            }
            usage += ">";
        }

        // Generate help
        int index = 0;
        help = new String[tree.size() + 1];
        help[index++] = getHeader() + " Options:";
        for (Entry<String, Pair<CommandInfo, ArrayList<Pair<String, CommandInfo>>>> e : tree.entrySet()) {

            help[index] = primaryColor + e.getKey();
            for (String arg : e.getValue().getFirst().arguments) {
                help[index] += primaryColor + " [" + arg + primaryColor + "]";
            }
            help[index] += " - " + secondaryColor + e.getValue().getFirst().description;


            index++;
        }

    }


    public void addMainOption(String main, String descriptor, String... args) {
        if (main == null) {
            return;
        }
        if (descriptor == null) {
            descriptor = "";
        }
        CommandInfo comInfo = new CommandInfo(main, descriptor, args);
        if (!tree.containsKey(main)) {
            tree.put(main, new Pair<TidyCompatibleCommand.CommandInfo, ArrayList<Pair<String, CommandInfo>>>(comInfo, new ArrayList<>()));
        }
    }

    public void addSubOption(String mainOption, String subOption, String description, String... args) {
        if (!tree.containsKey(mainOption)) {
            return;
        }
        CommandInfo comInfo = new CommandInfo(subOption, description, args);
        tree.get(mainOption).getSecond().add(new Pair<String, CommandInfo>(subOption, comInfo));
    }

    @Override
    public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {


        if (args.length == 0) {
            sender.sendMessage(new TextComponentString(getUsage(sender)));
            return;
        }


        if (args.length == 1 && !tree.containsKey(args[0])) {
            sender.sendMessage(new TextComponentString(getUsage(sender)));
            return;
        }


        if (args[0].equals(HELP_KEY)) {
            sendHelp(sender);
            return;
        }


        String[] truncatedArray = null;
        if (args.length <= 2) {
            truncatedArray = new String[0];
        } else {
            truncatedArray = new String[args.length - 2];
            System.arraycopy(args, 1, truncatedArray, 0, truncatedArray.length);
        }

        executeTidyCommand(sender, args[0], args.length > 1 ? args[1] : "", truncatedArray);

    }

    protected abstract void executeTidyCommand(ICommandSender sender, String mainArgument, String secondArgument, String[] args);


    public boolean checkForSecondaryArgument(String arg0, String arg1) {
        if (tree.containsKey(arg0)) {

            for (Pair<String, CommandInfo> str : tree.get(arg0).getSecond()) {
                if (str.getFirst().equals(arg1)) {
                    return true;
                }
            }
        }
        return false;
    }

    public String getHeader() {
        return primaryColor + "(" + displayName + ")" + secondaryColor;
    }

    public void sendHelp(ICommandSender sender) {
        for (String line : help) {
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

        ArrayList<Pair<String, CommandInfo>> result = tree.get(option).getSecond();
        sendFormattedMessage(sender, "For command " + option);
        for (Pair<String, CommandInfo> pair : result) {

            StringBuilder string = new StringBuilder(primaryColor + pair.getFirst());
            for (String arg : pair.getSecond().arguments) {
                string.append(primaryColor).append(" [").append(arg).append("]");
            }
            string.append(" - ").append(secondaryColor).append(pair.getSecond().description);

            sender.sendMessage(new TextComponentString(string.toString()));
        }

    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getUsage(ICommandSender sender) {
        return usage;
    }

}
