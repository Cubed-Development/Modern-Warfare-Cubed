package com.paneedah.weaponlib;

import net.minecraft.util.math.RayTraceResult;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class SafeGlobals {

	public final AtomicBoolean guiOpen = new AtomicBoolean();
	
	public final AtomicInteger currentItemIndex = new AtomicInteger(-1);
	
	public final AtomicReference<RayTraceResult> objectMouseOver = new AtomicReference<>();
	
	public final AtomicReference<RenderingPhase> renderingPhase = new AtomicReference<>();
}
