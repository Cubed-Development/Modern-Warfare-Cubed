package com.paneedah.weaponlib.compatibility;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;

import static com.paneedah.mw.proxies.ClientProxy.mc;

public abstract class CompatibleEntityRenderer extends Render<Entity> {

	public CompatibleEntityRenderer() {
		super(mc.getRenderManager());
	}

	@Override
	public final void doRender(Entity entity, double x, double y, double z, float entityYaw, float partialTicks) {
		doCompatibleRender(entity, x, y, z, entityYaw, partialTicks);
	}

	protected abstract void doCompatibleRender(Entity entity, double x, double y, double z, float entityYaw, float partialTicks);
}
