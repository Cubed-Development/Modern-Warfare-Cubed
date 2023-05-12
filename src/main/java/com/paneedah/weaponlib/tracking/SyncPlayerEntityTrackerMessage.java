package com.paneedah.weaponlib.tracking;

import io.netty.buffer.ByteBuf;

import static com.paneedah.mwc.utils.ModReference.log;

public class SyncPlayerEntityTrackerMessage implements net.minecraftforge.fml.common.network.simpleimpl.IMessage {

    private PlayerEntityTracker playerEntityTracker;
	private String statusMessage;

	public SyncPlayerEntityTrackerMessage() {}

	public SyncPlayerEntityTrackerMessage(PlayerEntityTracker playerEntityTracker) {
	    this(playerEntityTracker, null);
	}

	public SyncPlayerEntityTrackerMessage(PlayerEntityTracker playerEntityTracker, String statusMessage) {
		this.playerEntityTracker = playerEntityTracker; //a -> playerEntityTracker;
		this.statusMessage = statusMessage;
	}

	public void fromBytes(ByteBuf buf) {
	    try {

	        int statusMessageBytesLength = buf.readInt();
	        if(statusMessageBytesLength > 0) {
	            byte bytes[] = new byte[statusMessageBytesLength];
	            buf.readBytes(bytes);
	            this.statusMessage = new String(bytes);
	        }
	        playerEntityTracker = PlayerEntityTracker.fromBuf(buf);
	    } catch(Exception e) {
	        log.error("Failed to deserialize tracker {}", e);
	    }
	}

	public void toBytes(ByteBuf buf) {

	    byte[] statusMessageBytes = statusMessage != null ? statusMessage.getBytes() : new byte[0];
	    buf.writeInt(statusMessageBytes.length);
	    if(statusMessageBytes.length > 0) {
	        buf.writeBytes(statusMessageBytes);
	    }
	    playerEntityTracker.serialize(buf); // TODO: refactor

	}

    public PlayerEntityTracker getTracker() {
        return playerEntityTracker;
    }

    public String getStatusMessage() {
        return statusMessage;
    }


}
