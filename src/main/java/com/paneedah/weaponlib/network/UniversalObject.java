package com.paneedah.weaponlib.network;

import io.netty.buffer.ByteBuf;

import java.util.UUID;

public abstract class UniversalObject implements UniversallySerializable {
	
	private UUID uuid;
	
	protected int getSerialVersion() {
		return 0;
	}
	
	protected UniversalObject() {
		this.uuid = UUID.randomUUID();
	}
	
	public UUID getUuid() {
		return uuid;
	}

	@Override
	public void init(ByteBuf buf) {
		if(getSerialVersion() != buf.readInt()) {
		 // TODO: create custom exception
			throw new IndexOutOfBoundsException("Serial version mismatch"); 
		}
		this.uuid = new UUID(buf.readLong(), buf.readLong()); // TODO: default constructor initializes UUID, init overrides it. Not very elegant.
	}
	
	public void serialize(ByteBuf buf) {
		buf.writeInt(getSerialVersion());
		buf.writeLong(uuid.getMostSignificantBits());
		buf.writeLong(uuid.getLeastSignificantBits());
		//typeRegistry.serialize(this, buf);
	}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((uuid == null) ? 0 : uuid.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        UniversalObject other = (UniversalObject) obj;
        if (uuid == null) {
            if (other.uuid != null)
                return false;
        } else if (!uuid.equals(other.uuid))
            return false;
        return true;
    }
	
//    public static <T extends UniversalObject> T fromBytes(ByteBuf buf, TypeRegistry typeRegistry) {
//    	return typeRegistry.fromBytes(buf);
//    }
	
	

}
