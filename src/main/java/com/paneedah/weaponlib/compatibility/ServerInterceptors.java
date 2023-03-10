package com.paneedah.weaponlib.compatibility;

import com.paneedah.weaponlib.CommonModContext;
import com.paneedah.weaponlib.ModContext;
import com.paneedah.weaponlib.WeaponSpawnEntity;
import com.paneedah.weaponlib.mission.Missions;
import com.paneedah.weaponlib.mission.ObtainItemAction;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSourceIndirect;

public class ServerInterceptors {
    
    public static void onSlotContentChange(EntityPlayerMP player, InventoryPlayer inventory) {
        ModContext modContext = CommonModContext.getContext();
        if(modContext != null) {
            Missions.update(player, new ObtainItemAction(), modContext);
        }
    }
    
    public static float getKnockback(DamageSource source) {
        float strength = 0.4f;
        if(source instanceof EntityDamageSourceIndirect) {
            EntityDamageSourceIndirect indirectSource = (EntityDamageSourceIndirect) source;
            if(indirectSource.getImmediateSource() instanceof WeaponSpawnEntity) {
                strength = 0.05f;
            }
        }
        return strength;
    }
}
