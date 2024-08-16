package com.paneedah.mwc.network;

import io.netty.buffer.ByteBuf;

import java.util.UUID;

import static com.paneedah.mwc.utils.ModReference.RED_LOG;

//Todo: Finish cleaning this up, maybe two separate uuid are not necessary. Pausing this to working on removing the multithreading
public abstract class UniversalObject implements ISerializable {

    private final UUID uuid;
    private UUID readUUID = null;

    protected int getSerialVersion() {
        return 0;
    }

    protected UniversalObject() {
        this.uuid = UUID.randomUUID();
    }

    public UUID getUuid() {
        if (readUUID == null)
            return uuid;

        return readUUID;
    }

    @Override
    public void read(final ByteBuf byteBuf) {
        if (getSerialVersion() != byteBuf.readInt()) {
            RED_LOG.printFramedError("Networking", "Serial version mismatch", "", "Serial version: " + getSerialVersion(), "ByteBuf version: " + byteBuf.readInt());
            throw new IndexOutOfBoundsException();
        }

        this.readUUID = new UUID(byteBuf.readLong(), byteBuf.readLong());
    }

    @Override
    public void write(final ByteBuf byteBuf) {
        byteBuf.writeInt(getSerialVersion());

        final UUID uuid =  readUUID == null ? this.uuid : readUUID;

        byteBuf.writeLong(uuid.getMostSignificantBits());
        byteBuf.writeLong(uuid.getLeastSignificantBits());
    }

    @Override
    public int hashCode() {
        final UUID uuid =  readUUID == null ? this.uuid : readUUID;
        
        return 31 + ((uuid == null) ? 0 : uuid.hashCode());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null)
            return false;

        if (getClass() != obj.getClass())
            return false;

        final UniversalObject other = (UniversalObject) obj;

        final UUID uuid =  readUUID == null ? this.uuid : readUUID;

        if (uuid == null)
            return other.uuid == null;

        else return uuid.equals(other.uuid);
    }
}
