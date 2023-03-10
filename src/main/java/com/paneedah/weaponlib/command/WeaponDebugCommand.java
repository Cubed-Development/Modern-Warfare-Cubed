package com.paneedah.weaponlib.command;

import com.paneedah.weaponlib.*;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.Vec3d;
import scala.actors.threadpool.Arrays;

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
				if(pwi == null) return;
 				sendFormattedMessage(sender, "The weapon name is: " + getSecondaryColor() + pwi.getWeapon().getName());

			}

		} else if (mainArgument.equals("rotpoint")) {

			if (sender instanceof EntityPlayer && CommonModContext.getContext() != null) {
				PlayerWeaponInstance pwi = CommonModContext.getContext().getMainHeldWeapon();
				if(pwi == null) return;
				System.out.println("YO");
				
				ItemAttachment<Weapon> i = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.EXTRA, pwi);
				
				System.out.println(Arrays.toString(args));
				
				double x = Double.parseDouble(args[0]);
				double y = Double.parseDouble(args[1]);
				double z = Double.parseDouble(args[2]);
				System.out.println("Oye cabron");
				i.rotationPoint = new Vec3d(x, y, z);
 				sendFormattedMessage(sender, "The weapon name is: " + getSecondaryColor() + pwi.getWeapon().getName());
 				System.out.println("yo");
			}

		}
	}

}
