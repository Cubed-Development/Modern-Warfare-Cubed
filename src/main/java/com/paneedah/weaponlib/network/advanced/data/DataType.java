package com.paneedah.weaponlib.network.advanced.data;

import io.netty.buffer.ByteBuf;

public abstract class DataType<K> {
	
	public abstract K read(ByteBuf buf);
	public abstract void write(ByteBuf buf, K value);
	

}
