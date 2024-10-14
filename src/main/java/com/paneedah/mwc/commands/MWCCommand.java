package com.paneedah.mwc.commands;

import com.paneedah.mwc.commands.client.CommandPlayerItemInstanceRegistry;
import net.minecraft.command.ICommandSender;
import net.minecraftforge.fml.relauncher.FMLLaunchHandler;
import net.minecraftforge.server.command.CommandTreeBase;

import java.util.Collections;
import java.util.List;

import static com.paneedah.mwc.ProjectConstants.ID;

/**
 * @author Luna Mira Lage (Desoroxxx)
 * @since 0.2
 */
public final class MWCCommand extends CommandTreeBase {

    public MWCCommand() {
        if (!FMLLaunchHandler.side().isClient())
            return;

        addSubcommand(new CommandPlayerItemInstanceRegistry());
    }

    @Override
    public String getName() {
        return ID;
    }

    @Override
    public List<String> getAliases() {
        return Collections.singletonList("modernwarfarecubed");
    }

    @Override
    public String getUsage(ICommandSender sender) {
        return "/" + ID + " <subcommand>";
    }

    @Override
    public int getRequiredPermissionLevel() {
        return 0;
    }
}
