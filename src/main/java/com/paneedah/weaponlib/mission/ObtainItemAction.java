package com.paneedah.weaponlib.mission;

import com.google.gson.*;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.JsonUtils;

import java.lang.reflect.Type;

import static com.paneedah.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class ObtainItemAction extends Action {
    
    public static class Deserializer implements JsonDeserializer<ObtainItemAction> {
        @Override
        public ObtainItemAction deserialize(JsonElement element, Type typeOfT, JsonDeserializationContext context)
                throws JsonParseException {
            JsonObject jsonObject = element.getAsJsonObject();
            String itemName = JsonUtils.getString(jsonObject, "item");
            boolean isForTrade = JsonUtils.getBoolean(jsonObject, "isForTrade");
            Item item = Item.getByNameOrId(itemName);
            return new ObtainItemAction(item, isForTrade);
        }
    }
    
    private int itemId;
    private boolean isForTrade;
    
    public ObtainItemAction(Item item, boolean isForTrade) {
        this.itemId = Item.getIdFromItem(item);
        this.isForTrade = isForTrade;
    }
    
    public ObtainItemAction() {}
    
    @Override
    public boolean isTransient() {
        return !isForTrade;
    }

    @Override
    public int matches(Action anotherAction, EntityPlayer player) {
        return (anotherAction instanceof ObtainItemAction) ? playerInventoryContains(player) : 0;
    }
    
    private int playerInventoryContains(EntityPlayer player) {
        int count = 0;
        for(int i = 0; i < player.inventory.getSizeInventory(); i++) {
            ItemStack itemStack = player.inventory.getStackInSlot(i);
            if(itemStack != null &&  Item.getIdFromItem(itemStack.getItem()) == itemId) {
                count += itemStack.getCount();
            }
        }
        return count;
    }
    
    public Item getItem() {
        return Item.getItemById(itemId);
    }
    
    @Override
    public Object getResult(EntityPlayer player) {
//        compatibility.getMatchingInventoryItemStack(player, getItem());
//        compatibility.getInventoryItemStack(player, inventoryItemIndex);
        return super.getResult(player);
    }
    
    @Override
    public boolean quantityMatches(EntityPlayer player, int requiredQuantity) {
        return compatibility.getMatchingInventoryItemStack(player, getItem()) >= requiredQuantity;
    }

    @Override
    public void init(ByteBuf buf) {
        itemId = buf.readInt();
        isForTrade = buf.readBoolean();
    }
    
    @Override
    public void serialize(ByteBuf buf) {
        buf.writeInt(itemId);
        buf.writeBoolean(isForTrade);
    }
}
