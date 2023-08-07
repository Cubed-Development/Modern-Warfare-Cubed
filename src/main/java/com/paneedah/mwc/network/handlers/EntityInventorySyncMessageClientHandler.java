package com.paneedah.mwc.network.handlers;

import com.paneedah.mwc.capabilities.EquipmentCapability;
import com.paneedah.mwc.equipment.inventory.EquipmentInventory;
import com.paneedah.mwc.network.messages.EntityInventorySyncMessage;
import com.paneedah.weaponlib.ModContext;
import io.redstudioragnarok.redcore.utils.NetworkUtil;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static com.paneedah.mwc.proxies.ClientProxy.MC;

@NoArgsConstructor
@AllArgsConstructor
public final class EntityInventorySyncMessageClientHandler implements IMessageHandler<EntityInventorySyncMessage, IMessage> {

    private ModContext modContext;

    @Override
    @SideOnly(Side.CLIENT)
    public IMessage onMessage(EntityInventorySyncMessage entityInventorySyncMessage, MessageContext messageContext) {
        NetworkUtil.processMessage(messageContext, () -> {
            final EntityPlayer player = MC.player;
            final Entity targetEntity = entityInventorySyncMessage.getEntity(player.world);

            if (targetEntity != player || !entityInventorySyncMessage.isExcludeEntity()) {
                final EquipmentInventory inventory = entityInventorySyncMessage.getInventory();

                inventory.setContext(modContext);
                inventory.setOwner((EntityPlayer) targetEntity);
                EquipmentCapability.setInventory((EntityLivingBase) targetEntity, inventory);
            }
        });

        return null;
    }
}
