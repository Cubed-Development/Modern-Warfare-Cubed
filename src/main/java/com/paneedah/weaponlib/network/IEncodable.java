package com.paneedah.weaponlib.network;

import io.netty.buffer.ByteBuf;

/**
 * Allows encodable objects to easily be written and read from byte buffers.
 * 
 * @author Jim Holden, 2021
 *
 * @param <K> Instance of encodable class
 */
public interface IEncodable<K> {
	
	public K readFromBuf(ByteBuf buf);
	public void writeToBuf(ByteBuf buf);
 
}

