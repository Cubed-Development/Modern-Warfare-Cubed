package com.paneedah.mwc.network.messages;

import com.paneedah.weaponlib.vehicle.network.VehicleDataContainer;
import io.netty.buffer.ByteBuf;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public final class VehicleClientMessage implements IMessage {

    private VehicleDataContainer vehicleData = new VehicleDataContainer();

    @Override
    public void fromBytes(final ByteBuf byteBuf) {
        vehicleData = VehicleDataContainer.read(byteBuf);
    }

    @Override
    public void toBytes(final ByteBuf byteBuf) {
        vehicleData.write(byteBuf, vehicleData);
    }
}
