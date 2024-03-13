package com.paneedah.weaponlib.tile;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.rendering.Transform;
import com.paneedah.mwc.rendering.renderer.CustomTileEntityRenderer;
import com.paneedah.weaponlib.ClientEventHandler;
import com.paneedah.weaponlib.ModContext;
import dev.redstudio.redcore.utils.AABBUtil;
import dev.redstudio.redcore.utils.Case;
import lombok.Getter;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import static com.paneedah.mwc.utils.ModReference.ID;

public class CustomTileEntityConfiguration {

    @Getter private boolean modern; // True if the model is correctly positioned and does not need an offset
    @Getter private boolean prop = true; // If true the props tab will be automatically used and creativeTab will be ignored

    private Transform transform = Transform.getZero();

    private Material material;
    @Getter private String name;
    private String textureName;
    private CreativeTabs creativeTab;
    private float hardness = 6f;
    private float resistance = 600000f;
    private ModelBase model;
    private AtomicInteger counter = new AtomicInteger(10000);
    private Supplier<Integer> entityIdSupplier = () -> counter.incrementAndGet();
    private Consumer<TileEntity> positioning = tileEntity -> {};
    private Function<EnumFacing, AxisAlignedBB> boundingBox;

    public CustomTileEntityConfiguration withMaterial(Material material) {
        this.material = material;
        return this;
    }

    public CustomTileEntityConfiguration withName(String name) {
        this.name = Case.LOWER_SNAKE_CASE.enforce(name);
        return this;
    }

    public CustomTileEntityConfiguration withCreativeTab(CreativeTabs creativeTab) {
        this.creativeTab = creativeTab;
        return this;
    }

    public CustomTileEntityConfiguration withHardness(float hardness) {
        this.hardness = hardness;
        return this;
    }

    public CustomTileEntityConfiguration withResistance(float resistance) {
        this.resistance = resistance;
        return this;
    }

    public CustomTileEntityConfiguration withModel(ModelBase model, String textureName) {
        this.model = model;
        this.textureName = textureName + ".png";
        return this;
    }

    @Deprecated
    public CustomTileEntityConfiguration withPositioning(Consumer<TileEntity> positioning) {
        this.positioning = positioning;
        return this;
    }

    public CustomTileEntityConfiguration withBoundingBox(final double minX, final double minY, final double minZ, final double maxX, final double maxY, final double maxZ) {
        boundingBox = facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(minX, minY, minZ, maxX, maxY, maxZ));
        return this;
    }

    public CustomTileEntityConfiguration notAProp() {
        prop = false;
        return this;
    }

    public CustomTileEntityConfiguration modern() {
        modern = true;
        return this;
    }

    public CustomTileEntityConfiguration withTransform(Transform transform) {
        this.transform = transform;
        return this;
    }

    protected Class<? extends TileEntity> getBaseClass() {
        return CustomTileEntity.class;
    }


    protected Class<CustomTileEntity> createTileEntityClass() {
        int modEntityId = entityIdSupplier.get();
        return (Class<CustomTileEntity>) CustomTileEntityClassFactory.getInstance().generateEntitySubclass(getBaseClass(), modEntityId, this);
    }

    public void build(ModContext modContext) {
        final Class<? extends TileEntity> tileEntityClass = createTileEntityClass();

        final CustomTileEntityBlock tileEntityBlock = new CustomTileEntityBlock(material, tileEntityClass);
        
        tileEntityBlock.setTranslationKey(ID + "_" + name);
        tileEntityBlock.setHardness(hardness);
        tileEntityBlock.setResistance(resistance);
        tileEntityBlock.setCreativeTab(prop ? MWC.PROPS_TAB : creativeTab);
        tileEntityBlock.setBoundingBox(boundingBox);

        GameRegistry.registerTileEntity(tileEntityClass, new ResourceLocation(ID, "tile" + name));

        if (tileEntityBlock.getRegistryName() == null) {
            if (tileEntityBlock.getTranslationKey().length() < ID.length() + 2 + 5)
                throw new IllegalArgumentException("Unlocalized block name too short " + tileEntityBlock.getTranslationKey());

            final String unlocalizedName = tileEntityBlock.getTranslationKey().toLowerCase();
            final String registryName = unlocalizedName.substring(5 + ID.length() + 1);

            tileEntityBlock.setRegistryName(ID, registryName);
        }

        ForgeRegistries.BLOCKS.register(tileEntityBlock);
        ItemBlock itemBlock = new ItemBlock(tileEntityBlock);
        // TODO: introduce registerItem()

        modContext.registerRenderableItem(tileEntityBlock.getRegistryName(), itemBlock, null);

        if (FMLCommonHandler.instance().getSide().isClient()) {
            ClientEventHandler.BLANKMAPPED_LIST.add(tileEntityBlock);

            final ResourceLocation textureResource = new ResourceLocation(ID, prop ? "textures/models/props/" + textureName : textureName);
            final TileEntitySpecialRenderer tileEntitySpecialRenderer = new CustomTileEntityRenderer(model, textureResource, positioning, modern, transform);

            ClientRegistry.bindTileEntitySpecialRenderer(tileEntityClass, tileEntitySpecialRenderer);
        }
    }
}
