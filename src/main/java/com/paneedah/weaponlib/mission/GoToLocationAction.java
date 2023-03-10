package com.paneedah.weaponlib.mission;

import com.google.gson.*;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.JsonUtils;

import java.lang.reflect.Type;

public class GoToLocationAction extends Action {
    
    public static class Deserializer implements JsonDeserializer<GoToLocationAction> {
        @Override
        public GoToLocationAction deserialize(JsonElement element, Type typeOfT, JsonDeserializationContext context)
                throws JsonParseException {
            JsonObject jsonObject = element.getAsJsonObject();
            float x = JsonUtils.getFloat(jsonObject, "x");
            float y = JsonUtils.getFloat(jsonObject, "y");
            float z = JsonUtils.getFloat(jsonObject, "z");
            float minDistance = JsonUtils.getFloat(jsonObject, "minDistance");
            
            return new GoToLocationAction(x, y, z, minDistance);
        }
    }
    
    private float x;
    private float y;
    private float z;
    private float minSqDistance;
    
    public GoToLocationAction(float x, float y, float z, float minDistance) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.minSqDistance = minDistance * minDistance;
    }
    
    public GoToLocationAction() {}
    
    @Override
    public int matches(Action anotherAction, EntityPlayer player) {
        return anotherAction instanceof GoToLocationAction 
                && (    (x - ((GoToLocationAction)anotherAction).x) * (x - ((GoToLocationAction)anotherAction).x)
                      + (y - ((GoToLocationAction)anotherAction).y) * (y - ((GoToLocationAction)anotherAction).y)
                      + (z - ((GoToLocationAction)anotherAction).z) * (z - ((GoToLocationAction)anotherAction).z))
                <= minSqDistance ? 1 : 0;
    }

    @Override
    public void init(ByteBuf buf) {
        x = buf.readFloat();
        y = buf.readFloat();
        z = buf.readFloat();
        minSqDistance = buf.readFloat();
    }
    
    @Override
    public void serialize(ByteBuf buf) {
        buf.writeFloat(x);
        buf.writeFloat(y);
        buf.writeFloat(z);
        buf.writeFloat(minSqDistance);
    }
}
