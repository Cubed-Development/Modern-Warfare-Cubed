package com.paneedah.mwc.commands.client;


import com.paneedah.mwc.MWC;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.fml.relauncher.SideOnly;

import static com.paneedah.mwc.ProjectConstants.ID;
import static net.minecraftforge.fml.relauncher.Side.CLIENT;

/**
 * @author Luna Mira Lage (Desoroxxx)
 * @since 0.2
 */
@SideOnly(CLIENT)
public final class CommandPlayerItemInstanceRegistry extends ClientCommandTreeBase {

    public CommandPlayerItemInstanceRegistry() {
        addSubcommand(new CommandInvalidateItemstackInstanceCache());
        addSubcommand(new CommandClearRegistry());
    }

    @Override
    public String getName() {
        return "playeriteminstanceregistry";
    }

    @Override
    public String getUsage(final ICommandSender sender) {

        return "/" + ID + getName() + " <action>";
    }

    @SideOnly(CLIENT)
    private final static class CommandInvalidateItemstackInstanceCache extends ClientCommandBase {
        @Override
        public String getName() {
            return "invalidateitemstackinstancecache";
        }

        @Override
        public String getUsage(final ICommandSender sender) {
            return "";
        }

        @Override
        public void execute(final MinecraftServer server, final ICommandSender sender, final String[] args) throws CommandException {
            MWC.modContext.getPlayerItemInstanceRegistry().invalidateCache();
            sender.sendMessage(new TextComponentString("Invalidated itemstack instance cache"));
        }
    }

    @SideOnly(CLIENT)
    private final static class CommandClearRegistry extends ClientCommandBase {

        @Override
        public String getName() {
            return "clearregistry";
        }

        @Override
        public String getUsage(final ICommandSender sender) {
            return "";
        }

        @Override
        public void execute(final MinecraftServer server, final ICommandSender sender, final String[] args) throws CommandException {
            MWC.modContext.getPlayerItemInstanceRegistry().clearRegistry();
            sender.sendMessage(new TextComponentString("Cleared player item instance registry"));
        }
    }
}
