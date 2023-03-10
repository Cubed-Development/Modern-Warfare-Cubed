package com.paneedah.weaponlib.mission;

import com.google.gson.*;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.JsonUtils;
import net.minecraft.util.ResourceLocation;

import java.lang.reflect.Type;
import java.util.function.Supplier;

public class KillEntityAction extends Action {
    
    public static class Deserializer implements JsonDeserializer<KillEntityAction> {
        @Override
        public KillEntityAction deserialize(JsonElement element, Type typeOfT, JsonDeserializationContext context)
                throws JsonParseException {
            JsonObject jsonObject = element.getAsJsonObject();
            String entityName = JsonUtils.getString(jsonObject, "entity");
            return new KillEntityAction(entityName);
        }
    }
    
    private Supplier<Integer> registrationIdSupplier;
    
    public KillEntityAction(Entity entity) {
        this.registrationIdSupplier = () -> EntityList.getID(entity.getClass());
    }
    
    public KillEntityAction(Class<Entity> entityClass) {
        this.registrationIdSupplier = () -> EntityList.getID(entityClass);
    }
    
    public KillEntityAction(ResourceLocation entityResource) {
        this.registrationIdSupplier = 
                () -> net.minecraftforge.registries.GameData.getEntityRegistry().getID(entityResource);
    }
    
    public KillEntityAction(String entityName) {
        this.registrationIdSupplier = 
                () -> {
                    Class<? extends Entity> entityClass = EntityList.getClassFromName(entityName);
                    return EntityList.getID(entityClass);
                };
    }
    
    public KillEntityAction() {}
    
    private int getTargetEntityRegistrationId() {
        return registrationIdSupplier.get();
    }
    
    private void setTargetEntityRegistrationId(int id) {
        registrationIdSupplier = () -> id;
    }

    @Override
    public int matches(Action anotherAction, EntityPlayer player) {
        return (anotherAction instanceof KillEntityAction) 
                && getTargetEntityRegistrationId() == ((KillEntityAction)anotherAction).getTargetEntityRegistrationId()
                ? 1 : 0;
    }

    @Override
    public void init(ByteBuf buf) {
        setTargetEntityRegistrationId(buf.readInt());
    }
    
    @Override
    public void serialize(ByteBuf buf) {
        buf.writeInt(getTargetEntityRegistrationId());
    }
}
