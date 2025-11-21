package com.paneedah.mwc.network;

import io.netty.buffer.ByteBuf;

import java.util.UUID;

public abstract class UniversalObject implements ISerializable {

	private final UUID uuid = UUID.randomUUID();
	private UUID readUUID = null;

    public UUID getUuid() {
		if (readUUID == null)
			return uuid;

		return readUUID;
	}

	@Override
	public void read(final ByteBuf byteBuf) {
		final long most = byteBuf.readLong();
		final long least = byteBuf.readLong();

		readUUID = new UUID(most, least);
	}

	@Override
	public void write(final ByteBuf byteBuf) {
		final UUID uuid = readUUID == null ? this.uuid : readUUID;

		byteBuf.writeLong(uuid.getMostSignificantBits());
		byteBuf.writeLong(uuid.getLeastSignificantBits());
	}

	@Override
	public int hashCode() {
		final UUID uuid = readUUID == null ? this.uuid : readUUID;

		return 31 + uuid.hashCode();
	}

	@Override
	public boolean equals(final Object object) {
		if (this == object)
			return true;

		if (object == null)
			return false;

		if (getClass() != object.getClass())
			return false;

		final UUID uuid = readUUID == null ? this.uuid : readUUID;

		return uuid.equals(((UniversalObject) object).uuid);
	}
}
