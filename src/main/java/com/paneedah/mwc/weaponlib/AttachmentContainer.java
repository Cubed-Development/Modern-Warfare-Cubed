package com.paneedah.mwc.weaponlib;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;

import java.util.Collection;
import java.util.List;

public interface AttachmentContainer {
    List<CompatibleAttachment<? extends AttachmentContainer>> getActiveAttachments(EntityLivingBase entityPlayer,
            ItemStack itemStack);

    Collection<CompatibleAttachment<? extends AttachmentContainer>> getCompatibleAttachments(AttachmentCategory...category);
}
