package com.paneedah.mwc.weaponlib.compatibility;

import net.minecraft.block.material.Material;

import java.util.HashMap;
import java.util.Map;

public class CompatibleMaterial {
    
    private static Map<Material, CompatibleMaterial> materials = new HashMap<>();

    public static final CompatibleMaterial AIR = new CompatibleMaterial(Material.AIR);
    public static final CompatibleMaterial GRASS = new CompatibleMaterial(Material.GRASS);
    public static final CompatibleMaterial GROUND = new CompatibleMaterial(Material.GROUND);
    public static final CompatibleMaterial WOOD = new CompatibleMaterial(Material.WOOD);
    public static final CompatibleMaterial ROCK = new CompatibleMaterial(Material.ROCK);
    public static final CompatibleMaterial IRON = new CompatibleMaterial(Material.IRON);
    public static final CompatibleMaterial ANVIL = new CompatibleMaterial(Material.ANVIL);
    public static final CompatibleMaterial WATER = new CompatibleMaterial(Material.WATER);
    public static final CompatibleMaterial LAVA = new CompatibleMaterial(Material.LAVA);
    public static final CompatibleMaterial LEAVES = new CompatibleMaterial(Material.LEAVES);
    public static final CompatibleMaterial PLANTS = new CompatibleMaterial(Material.PLANTS);
    public static final CompatibleMaterial VINE = new CompatibleMaterial(Material.VINE);
    public static final CompatibleMaterial SPONGE = new CompatibleMaterial(Material.SPONGE);
    public static final CompatibleMaterial CLOTH = new CompatibleMaterial(Material.CLOTH);
    public static final CompatibleMaterial FIRE = new CompatibleMaterial(Material.FIRE);
    public static final CompatibleMaterial SAND = new CompatibleMaterial(Material.SAND);
    public static final CompatibleMaterial CIRCUITS = new CompatibleMaterial(Material.CIRCUITS);
    public static final CompatibleMaterial CARPET = new CompatibleMaterial(Material.CARPET);
    public static final CompatibleMaterial GLASS = new CompatibleMaterial(Material.GLASS);
    public static final CompatibleMaterial REDSTONE_LIGHT = new CompatibleMaterial(Material.REDSTONE_LIGHT);
    public static final CompatibleMaterial TNT = new CompatibleMaterial(Material.TNT);
    public static final CompatibleMaterial CORAL = new CompatibleMaterial(Material.CORAL);
    public static final CompatibleMaterial ICE = new CompatibleMaterial(Material.ICE);
    public static final CompatibleMaterial PACKEDICE = new CompatibleMaterial(Material.PACKED_ICE);
    public static final CompatibleMaterial SNOW = new CompatibleMaterial(Material.SNOW);
    public static final CompatibleMaterial CRAFTED_SNOW = new CompatibleMaterial(Material.CRAFTED_SNOW);
    public static final CompatibleMaterial CACTUS = new CompatibleMaterial(Material.CACTUS);
    public static final CompatibleMaterial CLAY = new CompatibleMaterial(Material.CLAY);
    public static final CompatibleMaterial GOURD = new CompatibleMaterial(Material.GOURD);
    public static final CompatibleMaterial DRAGON_EGG = new CompatibleMaterial(Material.DRAGON_EGG);
    public static final CompatibleMaterial PORTAL = new CompatibleMaterial(Material.PORTAL);
    public static final CompatibleMaterial CAKE = new CompatibleMaterial(Material.CAKE);
    public static final CompatibleMaterial WEB = new CompatibleMaterial(Material.WEB);

    private Material material;

    public CompatibleMaterial(Material material) {
        this.material = material;
        materials.put(material, this);
    }

    public Material getMaterial() {
        return material;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((material == null) ? 0 : material.hashCode());
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
        CompatibleMaterial other = (CompatibleMaterial) obj;
        if (material == null) {
            if (other.material != null)
                return false;
        } else if (!material.equals(other.material))
            return false;
        return true;
    }
    
    static CompatibleMaterial getMaterial(Material material) {
        return materials.get(material);
    }
}
