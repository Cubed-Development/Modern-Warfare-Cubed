package com.paneedah.mwc.weaponlib.compatibility;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;

public abstract class CompatibleCommand extends CommandBase {

    @Override
    public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
        execCommand(sender, args);
    }

    protected abstract void execCommand(ICommandSender sender, String[] args);

    @Override
    public String getName() {
        return getCompatibleName();
    }

    public abstract String getCompatibleName();

    @Override
    public String getUsage(ICommandSender sender) {
        return getCompatibleUsage(sender);
    }

    public abstract String getCompatibleUsage(ICommandSender sender);
}
