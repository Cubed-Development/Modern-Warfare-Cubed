package com.paneedah.weaponlib.mission;

import com.google.gson.*;
import com.paneedah.weaponlib.network.TypeRegistry;
import com.paneedah.weaponlib.network.UniversallySerializable;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.JsonUtils;

import java.lang.reflect.Type;

public class Goal implements UniversallySerializable {
    
    public static class Deserializer implements JsonDeserializer<Goal> {
                
        @Override
        public Goal deserialize(JsonElement jsonElement, Type typeOfT, JsonDeserializationContext context)
                throws JsonParseException {
            JsonObject goalObject = jsonElement.getAsJsonObject();
            JsonObject actionObject = JsonUtils.getJsonObject(goalObject, "action");
            Action action = context.deserialize(actionObject, Action.class);
            int quantity = JsonUtils.getInt(goalObject, "quantity", 1);
            return new Goal(action, quantity);
        }
    }

    private Action requiredAction;
    private int quantity;
    
    public Goal() {}

    public Goal(Action requiredAction, int quantity) {
        this.requiredAction = requiredAction;
        this.quantity = quantity;
    }
    
    public Action getRequiredAction() {
        return requiredAction;
    }
    
    public int getQuantity() {
        return quantity;
    }

    public boolean update(Action action, EntityPlayer player) {
        int matchedCount = requiredAction.matches(action, player);
        if(matchedCount > 0) {
            if(requiredAction.isTransient()) {
                if(quantity > 0) {
                    quantity -= Math.min(matchedCount, quantity);
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }
    
    public boolean isCompleted(EntityPlayer player) {
        return requiredAction.isTransient() ? quantity == 0 : 
            requiredAction.quantityMatches(player, quantity);
    }
    
    @Override
    public void init(ByteBuf buf) {
        requiredAction = TypeRegistry.getInstance().fromBytes(buf);
        quantity = buf.readInt();
    }

    @Override
    public void serialize(ByteBuf buf) {
        TypeRegistry.getInstance().toBytes(requiredAction, buf);
        buf.writeInt(quantity);
    }
}
