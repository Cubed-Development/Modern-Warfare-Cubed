package com.paneedah.mwc.network;

import io.netty.buffer.ByteBuf;

public interface ISerializable {

    void read(ByteBuf byteBuf);

    void write(ByteBuf byteBuf);
}
