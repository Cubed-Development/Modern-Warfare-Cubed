package com.paneedah.mwc.commands.client;

import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.server.command.CommandTreeBase;

import static net.minecraftforge.fml.relauncher.Side.CLIENT;

/**
 * @author Luna Mira Lage (Desoroxxx)
 * @since 0.2
 */
@SideOnly(CLIENT)
public abstract class ClientCommandTreeBase extends CommandTreeBase {

    @Override
    public int getRequiredPermissionLevel() {
        return 0;
    }

    @Override
    public boolean checkPermission(final MinecraftServer server, final ICommandSender sender) {
        return true;
    }
}
