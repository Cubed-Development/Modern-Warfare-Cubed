package com.paneedah.weaponlib.compatibility;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.IThreadListener;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

public class CompatibleMessageContext {

	private MessageContext ctx;

	public CompatibleMessageContext(MessageContext ctx) {
		this.ctx = ctx;
	}
	


	public boolean isServerSide() {
		return ctx.side == Side.SERVER;
	}

	public EntityPlayer getPlayer() {
		return ctx.getServerHandler().player;
	}

	public void runInMainThread(Runnable runnable) {
		IThreadListener mainThread = (IThreadListener) ctx.getServerHandler().player.world;
		mainThread.addScheduledTask(runnable);
	}

}
