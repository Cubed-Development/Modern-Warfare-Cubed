package com.paneedah.weaponlib.mission;

import com.google.gson.*;
import com.paneedah.weaponlib.network.UniversallySerializable;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.JsonUtils;

import java.lang.reflect.Type;

public interface MissionReward extends UniversallySerializable {
    
    public void redeem(EntityPlayer player);
    
    public static class ItemReward implements MissionReward {
        
        public static class Deserializer implements JsonDeserializer<ItemReward> {
            @Override
            public ItemReward deserialize(JsonElement element, Type typeOfT, JsonDeserializationContext context)
                    throws JsonParseException {
                JsonObject jsonObject = element.getAsJsonObject();
                String itemName = JsonUtils.getString(jsonObject, "item");
                int quantity = JsonUtils.getInt(jsonObject, "quantity", 1);
                return new ItemReward(Item.getByNameOrId(itemName), quantity);
            }
        }
        
        private Item item;
        private int quantity;
        private ItemStack reward;
        
        public ItemReward() {}
        
        public ItemReward(Item item, int quantity) {
            this.reward = new ItemStack(item, quantity);
        }
        
        public ItemStack getReward() {
            return reward;
        }

        @Override
        public void redeem(EntityPlayer player) {
            player.inventory.addItemStackToInventory(
                    new ItemStack(this.reward.getItem(), this.reward.getCount()));
        }

        @Override
        public void init(ByteBuf buf) {
            item = Item.getItemById(buf.readInt());
            quantity = buf.readInt();
        }

        @Override
        public void serialize(ByteBuf buf) {
            buf.writeInt(Item.getIdFromItem(item));
            buf.writeInt(quantity);
        }
        
    }
}
