package com.paneedah.weaponlib.network.advanced.data;

import io.netty.buffer.ByteBuf;
import net.minecraftforge.fml.common.network.ByteBufUtils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class DataTypes {

	public static final DataType<Integer> INTEGER = new DataType<Integer>() {

		@Override
		public Integer read(ByteBuf buf) {
			return buf.readInt();
		}

		@Override
		public void write(ByteBuf buf, Integer value) {
			buf.writeInt(value);
		}

	};

	public static final DataType<Float> FLOAT = new DataType<Float>() {

		@Override
		public Float read(ByteBuf buf) {
			return buf.readFloat();
		}

		@Override
		public void write(ByteBuf buf, Float value) {
			buf.writeFloat(value);
		}
	};

	public static final DataType<Boolean> BOOLEAN = new DataType<Boolean>() {

		@Override
		public Boolean read(ByteBuf buf) {
			return buf.readBoolean();
		}

		@Override
		public void write(ByteBuf buf, Boolean value) {
			buf.writeBoolean(value);
		}

	};

	public static final DataType<String> STRING = new DataType<String>() {

		@Override
		public String read(ByteBuf buf) {
			return ByteBufUtils.readUTF8String(buf);
		}

		@Override
		public void write(ByteBuf buf, String value) {
			ByteBufUtils.writeUTF8String(buf, value);
		}

	};
	
	public static final DataType<ByteArrayOutputStream> BAOS = new DataType<ByteArrayOutputStream>() {
		
		@Override
		public void write(ByteBuf buf, ByteArrayOutputStream value) {
			buf.writeInt(value.size());
			buf.writeBytes(value.toByteArray());
		}
		
		@Override
		public ByteArrayOutputStream read(ByteBuf buf) {
			int size = buf.readInt();
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
		
			try {
				buf.readBytes(baos, size);
			} catch (IOException e) {
				e.printStackTrace();
			}
			return baos;
		}
	};
		

	
	

}
