package com.paneedah.mwc.weaponlib.tile;

import com.paneedah.mwc.weaponlib.ItemAttachment;
import com.paneedah.mwc.weaponlib.ModContext;
import com.paneedah.mwc.weaponlib.WeightedOptions;
import com.paneedah.mwc.weaponlib.compatibility.CompatibleSound;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.EnumDifficulty;

import java.util.*;

public class LootBoxConfiguration extends CustomTileEntityConfiguration<LootBoxConfiguration> {

    private static final int DEFAULT_EQUIPMENT_DISPENSE_TIMEOUT_TICKS = 100;

    static class Equipment {
        Item item;
        List<ItemAttachment<?>> attachments;
        int stackSize = 1;
    }

    private static class EquipmentValue {
        Equipment equipment;
        float weight;
        public EquipmentValue(Equipment equipment, float weight) {
            this.equipment = equipment;
            this.weight = weight;
        }

    }

    private static class EquipmentKey {
        EnumDifficulty difficulty;
        Item item;
        ItemAttachment<?> attachments[];
        int stackSize;

        public EquipmentKey(EnumDifficulty difficulty, Item item, ItemAttachment<?>[] attachments) {
            this.difficulty = difficulty;
            this.item = item;
            this.attachments = attachments;
        }
        
        public EquipmentKey(EnumDifficulty difficulty, Item item, int stackSize) {
            this.difficulty = difficulty;
            this.item = item;
            this.attachments = new ItemAttachment<?>[0];
            this.stackSize = stackSize;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + Arrays.hashCode(attachments);
            result = prime * result + ((difficulty == null) ? 0 : difficulty.hashCode());
            result = prime * result + ((item == null) ? 0 : item.hashCode());
            result = prime * result + stackSize;
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            EquipmentKey other = (EquipmentKey) obj;
            if (!Arrays.equals(attachments, other.attachments))
                return false;
            if (difficulty != other.difficulty)
                return false;
            if (item == null) {
                if (other.item != null)
                    return false;
            } else if (!item.equals(other.item))
                return false;
            if (stackSize != other.stackSize)
                return false;
            return true;
        }
    }

    private Map<EquipmentKey, EquipmentValue> equipmentOptions = new HashMap<>();

    private WeightedOptions<EnumDifficulty, Equipment> builtEquipmentOptions;
    
    private int equipmentDispenseTimeoutTicks = DEFAULT_EQUIPMENT_DISPENSE_TIMEOUT_TICKS;
    
    private String dispenseSound;
    private String equipmentNotAvailableSound;
    
    private CompatibleSound dispenseCompatibleSound;
    private CompatibleSound equipmentNotAvailableCompatibleSound;

    public LootBoxConfiguration withEquipmentOption(Item item, EnumDifficulty difficultyLevel, float weight, ItemAttachment<?>...attachments) {
        withEquipmentOption(equipmentOptions, item, difficultyLevel, weight, attachments);
        return this;
    }
    
    public LootBoxConfiguration withEquipmentOption(Item item, EnumDifficulty difficultyLevel, float weight, int stackSize) {
        withEquipmentOption(equipmentOptions, item, difficultyLevel, weight, stackSize);
        return this;
    }
    
    public LootBoxConfiguration withEquipmentDispenseTimeout(int timeoutSeconds) {
        this.equipmentDispenseTimeoutTicks = timeoutSeconds * 20;
        return this;
    }
    
    public LootBoxConfiguration withEquipementDispenseSound(String sound) {
        this.dispenseSound = sound.toLowerCase();
        return this;
    }
    
    public LootBoxConfiguration withEquipmentNotAvailableSound(String sound) {
        this.equipmentNotAvailableSound = sound.toLowerCase();
        return this;
    }

    private LootBoxConfiguration withEquipmentOption(Map<EquipmentKey, EquipmentValue> equipmentOptions, Item item, 
            EnumDifficulty difficultyLevel, float weight, ItemAttachment<?>... attachments) {
//        if(item == null) {
//            log.warn("Attempted to configure entity equipment with null item");
//            return this;
//        }
        Equipment equipment = new Equipment();
        equipment.item = item;
        equipment.attachments = Arrays.asList(attachments);
        EnumDifficulty[] difficultyValues = EnumDifficulty.values();
        for(int i = difficultyLevel.ordinal(); i < difficultyValues.length; i++) {      
            equipmentOptions.put(new EquipmentKey(difficultyValues[i], equipment.item, attachments), 
                    new EquipmentValue(equipment, weight));
        }
        return this;
    }
    
    private LootBoxConfiguration withEquipmentOption(Map<EquipmentKey, EquipmentValue> equipmentOptions, Item item, 
            EnumDifficulty difficultyLevel, float weight, int stackSize) {
//        if(item == null) {
//            log.warn("Attempted to configure entity equipment with null item");
//            return this;
//        }
        Equipment equipment = new Equipment();
        equipment.item = item;
        equipment.stackSize = stackSize;
        equipment.attachments = Collections.emptyList();
        EnumDifficulty[] difficultyValues = EnumDifficulty.values();
        for(int i = difficultyLevel.ordinal(); i < difficultyValues.length; i++) {      
            equipmentOptions.put(new EquipmentKey(difficultyValues[i], equipment.item, stackSize), 
                    new EquipmentValue(equipment, weight));
        }
        return this;
    }
    
    protected Class<? extends TileEntity> getBaseClass() {
        return LootBoxTileEntity.class;
    }
    
    @Override
    public void build(ModContext modContext) {
        WeightedOptions.Builder<EnumDifficulty, Equipment> equipmentOptionsBuilder = new WeightedOptions.Builder<>();

        equipmentOptions.forEach((key, value) -> {
            equipmentOptionsBuilder.withOption(value.equipment, key.difficulty, value.weight);
        });

        builtEquipmentOptions = equipmentOptionsBuilder.build();
        
        dispenseCompatibleSound = modContext.registerSound(dispenseSound);
        equipmentNotAvailableCompatibleSound = modContext.registerSound(equipmentNotAvailableSound);
        
        super.build(modContext);
    }
    
    public WeightedOptions<EnumDifficulty, Equipment> getEquipmentOptions() {
        return builtEquipmentOptions;
    }

    public int getEquipmentDispenseTimeoutTicks() {
        return equipmentDispenseTimeoutTicks;
    }
    
    public CompatibleSound getDispenseSound() {
        return dispenseCompatibleSound;
    }
    
    public CompatibleSound getEquipmentNotAvailableSound() {
        return equipmentNotAvailableCompatibleSound;
    }

}
