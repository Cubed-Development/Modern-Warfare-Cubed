package com.paneedah.mwc.network.messages;

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

    private static final BlockPos.MutableBlockPos MUTABLE_BLOCK_POS = new BlockPos.MutableBlockPos();

    private Vector3D position = new Vector3D();
    private Vector3D velocity = new Vector3D();
    private float strength;
    private boolean destroyBlocks;

    private int explosionParticleTextureId;
    private float explosionParticleScaleCoefficient;
    private float explosionParticleAgeCoefficient;

    private int smokeParticleTextureId;
    private float smokeParticleScaleCoefficient;
    private float smokeParticleAgeCoefficient;

    private List<BlockPos> affectedBlockPositions;

    @Override
    public void fromBytes(final ByteBuf byteBuf) {
        position.read(byteBuf);
        velocity.read(byteBuf);
        strength = byteBuf.readFloat();
        destroyBlocks = byteBuf.readBoolean();

        explosionParticleTextureId = byteBuf.readInt();
        explosionParticleScaleCoefficient = byteBuf.readFloat();
        explosionParticleAgeCoefficient = byteBuf.readFloat();

        smokeParticleTextureId = byteBuf.readInt();
        smokeParticleScaleCoefficient = byteBuf.readFloat();
        smokeParticleAgeCoefficient = byteBuf.readFloat();

        final int affectedBlockPositionsSize = byteBuf.readInt();

        affectedBlockPositions = new ArrayList<>(affectedBlockPositionsSize);

        for (int i1 = 0; i1 < affectedBlockPositionsSize; ++i1) {
            final int x = byteBuf.readByte() + (int) position.x;
            final int y = byteBuf.readByte() + (int) position.y;
            final int z = byteBuf.readByte() + (int) position.z;

            affectedBlockPositions.add(MUTABLE_BLOCK_POS.setPos(x, y, z).toImmutable());
        }
    }

    @Override
    public void toBytes(final ByteBuf byteBuf) {
        position.write(byteBuf);
        velocity.write(byteBuf);
        byteBuf.writeFloat(strength);
        byteBuf.writeBoolean(destroyBlocks);

        byteBuf.writeInt(explosionParticleTextureId);
        byteBuf.writeFloat(explosionParticleScaleCoefficient);
        byteBuf.writeFloat(explosionParticleAgeCoefficient);

        byteBuf.writeInt(smokeParticleTextureId);
        byteBuf.writeFloat(smokeParticleScaleCoefficient);
        byteBuf.writeFloat(smokeParticleAgeCoefficient);

        byteBuf.writeInt(affectedBlockPositions.size());

        for (BlockPos blockpos : affectedBlockPositions) {
            final int x = blockpos.getX() - (int) position.x;
            final int y = blockpos.getY() - (int) position.y;
            final int z = blockpos.getZ() - (int) position.z;

            byteBuf.writeByte(x);
            byteBuf.writeByte(y);
            byteBuf.writeByte(z);
        }
    }
}
