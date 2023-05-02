package com.paneedah.mwc.weaponlib.melee;

import com.paneedah.mwc.weaponlib.compatibility.CompatibleMessage;
import com.paneedah.mwc.weaponlib.network.TypeRegistry;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;

public class TryAttackMessage implements CompatibleMessage {

	private int entityId;
	private boolean isHeavyAttack;
	private PlayerMeleeInstance instance;

	public TryAttackMessage() {}
	
	public TryAttackMessage(PlayerMeleeInstance instance, Entity entity, boolean isHeavyAttack) {
	    this.instance = instance;
	    this.entityId = entity.getEntityId();
	    this.isHeavyAttack = isHeavyAttack;
	}
	
	public void fromBytes(ByteBuf buf) {
	    this.instance = TypeRegistry.getInstance().fromBytes(buf);
		this.entityId = buf.readInt();
		this.isHeavyAttack = buf.readBoolean();
	}

	public void toBytes(ByteBuf buf) {
	    TypeRegistry.getInstance().toBytes(instance, buf);
		buf.writeInt(entityId);
		buf.writeBoolean(isHeavyAttack);
	}

	public Entity getEntity(World world) {
	    return world.getEntityByID(entityId);
	}
	
	public boolean isHeavyAttack() {
	    return isHeavyAttack;
	}

    public PlayerMeleeInstance getInstance() {
        return instance;
    }
}
