package com.paneedah.mwc.network.messages;

import com.paneedah.mwc.network.NetworkUtil;
import io.netty.buffer.ByteBuf;
import io.redstudioragnarok.redcore.vectors.Vector3D;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

import java.util.ArrayList;
import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public final class ExplosionMessage implements IMessage {

    private Vector3D position;
    private float strength;
    private List<BlockPos> affectedBlockPositions;
    private Vector3D motion;
    private boolean isDestroyingBlocks;
    private float explosionParticleAgeCoefficient;
    private float smokeParticleAgeCoefficient;
    private float explosionParticleScaleCoefficient;
    private float smokeParticleScaleCoefficient;
    private int explosionParticleTextureId;
    private int smokeParticleTextureId;

    @Override
    public void fromBytes(final ByteBuf byteBuf) {
        this.position = NetworkUtil.readVector3D(byteBuf);
        this.strength = byteBuf.readFloat();
        this.explosionParticleAgeCoefficient = byteBuf.readFloat();
        this.smokeParticleAgeCoefficient = byteBuf.readFloat();
        this.explosionParticleScaleCoefficient = byteBuf.readFloat();
        this.smokeParticleScaleCoefficient = byteBuf.readFloat();
        this.explosionParticleTextureId = byteBuf.readInt();
        this.smokeParticleTextureId = byteBuf.readInt();
        this.isDestroyingBlocks = byteBuf.readBoolean();
        int i = byteBuf.readInt();
        this.affectedBlockPositions = new ArrayList<>(i);
        int j = (int) this.position.x;
        int k = (int) this.position.y;
        int l = (int) this.position.z;

        for (int i1 = 0; i1 < i; ++i1) {
            int j1 = byteBuf.readByte() + j;
            int k1 = byteBuf.readByte() + k;
            int l1 = byteBuf.readByte() + l;
            this.affectedBlockPositions.add(new BlockPos(j1, k1, l1));
        }

        this.motion = NetworkUtil.readVector3D(byteBuf);
    }

    @Override
    public void toBytes(final ByteBuf byteBuf) {
        NetworkUtil.writeVector3D(byteBuf, this.position);
        byteBuf.writeFloat(this.strength);
        byteBuf.writeFloat(this.explosionParticleAgeCoefficient);
        byteBuf.writeFloat(this.smokeParticleAgeCoefficient);
        byteBuf.writeFloat(this.explosionParticleScaleCoefficient);
        byteBuf.writeFloat(this.smokeParticleScaleCoefficient);
        byteBuf.writeInt(this.explosionParticleTextureId);
        byteBuf.writeInt(this.smokeParticleTextureId);
        byteBuf.writeBoolean(this.isDestroyingBlocks);
        byteBuf.writeInt(this.affectedBlockPositions.size());
        int i = (int) this.position.x;
        int j = (int) this.position.y;
        int k = (int) this.position.z;

        for (BlockPos blockpos : this.affectedBlockPositions) {
            int l = blockpos.getX() - i;
            int i1 = blockpos.getY() - j;
            int j1 = blockpos.getZ() - k;
            byteBuf.writeByte(l);
            byteBuf.writeByte(i1);
            byteBuf.writeByte(j1);
        }

        NetworkUtil.writeVector3D(byteBuf, this.motion);
    }
}
