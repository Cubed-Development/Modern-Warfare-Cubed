package com.paneedah.mwc.commands.client;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;
import net.minecraftforge.fml.relauncher.SideOnly;

import static net.minecraftforge.fml.relauncher.Side.CLIENT;

/**
 * Base class for client-side commands.
 *
 * @author Luna Mira Lage (Desoroxxx)
 * @since 0.2
 */
@SideOnly(CLIENT)
public abstract class ClientCommandBase extends CommandBase {

    @Override
    public int getRequiredPermissionLevel() {
        return 0;
    }

    @Override
    public boolean checkPermission(final MinecraftServer server, final ICommandSender sender) {
        return true;
    }
}
