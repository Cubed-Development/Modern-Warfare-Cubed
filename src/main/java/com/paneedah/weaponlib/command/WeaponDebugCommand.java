package com.paneedah.weaponlib.command;

import com.paneedah.mwc.instancing.PlayerWeaponInstance;
import com.paneedah.weaponlib.*;
import dev.redstudio.redcore.math.vectors.Vector3F;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;

import java.util.Arrays;

public class WeaponDebugCommand extends TidyCompatibleCommand {

    private static final String NAME = "name";

    public WeaponDebugCommand() {
        super("wdc", "Weapon Debug Command");

        addMainOption(NAME, "Gets the name of the weapon");
        addMainOption("rotpoint", "Gets the name of the weapon");
    }

    @Override
    protected void executeTidyCommand(ICommandSender sender, String mainArgument, String secondArgument,
                                      String[] args) {
        if (mainArgument.equals(NAME)) {

            if (sender instanceof EntityPlayer && CommonModContext.getContext() != null) {
                PlayerWeaponInstance pwi = CommonModContext.getContext().getMainHeldWeapon();
                if (pwi == null) {
                    return;
                }
                sendFormattedMessage(sender, "The weapon name is: " + getSecondaryColor() + pwi.getWeapon().getName());

            }

        } else if (mainArgument.equals("rotpoint")) {

            if (sender instanceof EntityPlayer && CommonModContext.getContext() != null) {
                PlayerWeaponInstance pwi = CommonModContext.getContext().getMainHeldWeapon();
                if (pwi == null) {
                    return;
                }
                System.out.println("YO");

                ItemAttachment<Weapon> i = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.EXTRA, pwi);

                System.out.println(Arrays.toString(args));

                final float x = Float.parseFloat(args[0]);
                final float y = Float.parseFloat(args[1]);
                final float z = Float.parseFloat(args[2]);
                System.out.println("Oye cabron");
                i.pivotPoint = new Vector3F(x, y, z);
                sendFormattedMessage(sender, "The weapon name is: " + getSecondaryColor() + pwi.getWeapon().getName());
                System.out.println("yo");
            }

        }
    }

}
