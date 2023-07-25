package com.paneedah.mwc.network.messages;

import com.paneedah.weaponlib.vehicle.network.VehicleDataContainer;
import io.netty.buffer.ByteBuf;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

import java.io.IOException;

import static com.paneedah.mwc.utils.ModReference.RED_LOG;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public final class VehicleClientMessage implements IMessage {

    private VehicleDataContainer vehicleData = new VehicleDataContainer();

    @Override
    public void fromBytes(final ByteBuf byteBuf) {
        try {
            vehicleData = VehicleDataContainer.read(byteBuf);
        } catch (IOException ioException) {
            RED_LOG.printFramedError("Networking", "Failed to read vehicle data", "", ioException.getMessage());
        }
    }

    @Override
    public void toBytes(final ByteBuf byteBuf) {
        vehicleData.write(byteBuf, vehicleData);
    }
}
