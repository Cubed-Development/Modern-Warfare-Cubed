package com.paneedah.mwc.weaponlib.network.advanced;

import com.paneedah.mwc.weaponlib.compatibility.CompatibleMessage;
import com.paneedah.mwc.weaponlib.network.advanced.data.PacketSerializer;
import io.netty.buffer.ByteBuf;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class SimplePacket implements CompatibleMessage {
	
	private ArrayList<PacketSerializer<?>> serializers = new ArrayList<>();
	
	public SimplePacket() {
	
		
	}
	
	@Override
	public void fromBytes(ByteBuf buf) {
		
	
		
		for(Field f : getClass().getFields()) {
			if(f.getType() == PacketSerializer.class) {
				try {
					PacketSerializer<?> serializer = (PacketSerializer<?>) f.get(this);
					serializer.read(buf);
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		/*
		for(PacketSerializer<?> s : serializers) {
			s.read(buf);
		}	*/
	}

	@Override
	public void toBytes(ByteBuf buf) {
		for(Field f : getClass().getFields()) {
			if(f.getType() == PacketSerializer.class) {
				try {
					PacketSerializer<?> serializer = (PacketSerializer<?>) f.get(this);
					serializer.write(buf);
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		/*
		for(PacketSerializer<?> s : serializers) {
			s.write(buf);
		}	*/
	}
	
	
	
	

	
	

	

}
