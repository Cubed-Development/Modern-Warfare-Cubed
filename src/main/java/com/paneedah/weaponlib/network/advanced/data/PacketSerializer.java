package com.paneedah.weaponlib.network.advanced.data;

import io.netty.buffer.ByteBuf;

import java.util.ArrayList;

public class PacketSerializer<K> {
	
	public DataType<K> dataType;
	public K value;
	
	public ArrayList<K> valueArray = new ArrayList<>();
	public boolean isArray;
	
	
	public PacketSerializer(DataType<K> dataType) {
		this.dataType = dataType;
	}
	
	public PacketSerializer<K> setArray() {
		this.isArray = true;
		return this;
	}
	
	public boolean isArray() {
		return this.isArray;
	}
	
	public ArrayList<K> getArray() {
		return this.valueArray;
	}
	
	public void write(ByteBuf buf) {
		if(isArray) {
			buf.writeInt(valueArray.size());
			for(K value : valueArray) {
				dataType.write(buf, value);
			}
		} else {
			dataType.write(buf, value);
		}
		
	}
	
	public void read(ByteBuf buf) {
		if(isArray) {
			for(int i = 0; i < buf.readInt(); ++i) {
				valueArray.add(dataType.read(buf));
			}
		} else {
			this.value = dataType.read(buf);
		}
		
	}
	
	public K getValue() {
		return value;
	}
	
	public void setValue(K value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		if(!isArray) {
			return "( Serializer@" + hashCode() + ", Value: " + getValue() + ")";
		} else {
			return "( Serializer@" + hashCode() + ", Value: " + getArray() + ")";
		}
		
	}
	

}
