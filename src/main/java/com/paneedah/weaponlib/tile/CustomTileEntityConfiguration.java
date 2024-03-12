package com.paneedah.weaponlib.tile;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.rendering.Transform;
import com.paneedah.mwc.rendering.renderer.CustomTileEntityRenderer;
import com.paneedah.weaponlib.ClientEventHandler;
import com.paneedah.weaponlib.ModContext;
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

public class CustomTileEntityConfiguration<T extends CustomTileEntityConfiguration<T>> {

    @Getter private boolean modern; // True if the model is correctly positioned and does not need an offset
    @Getter private boolean prop = true; // If true the props tab will be automatically used and creativeTab will be ignored

    private Transform transform = Transform.ZERO.duplicate();

    private Material material;
    @Getter private String name;
    private String textureName;
    private CreativeTabs creativeTab;
    private float hardness = 6f;
    private float resistance = 600000f;
    private ModelBase model;
    private String modelClassName;
    private AtomicInteger counter = new AtomicInteger(10000);
    private Supplier<Integer> entityIdSupplier = () -> counter.incrementAndGet();
    private Consumer<TileEntity> positioning = tileEntity -> {};
    private Function<EnumFacing, AxisAlignedBB> boundingBox;
    
    
    private T safeCast(CustomTileEntityConfiguration<T> input) {
        return (T) input;
    }

    public T withMaterial(Material material) {
        this.material = material;
        return safeCast(this);
    }
    
    public T withName(String name) {
        this.name = Case.LOWER_SNAKE_CASE.enforce(name);
        return safeCast(this);
    }

    @Deprecated
    public T withTextureName(String textureName) {
        this.textureName = textureName + ".png";
        return safeCast(this);
    }
    
    public T withCreativeTab(CreativeTabs creativeTab) {
        this.creativeTab = creativeTab;
        return safeCast(this);
    }
    
    public T withHardness(float hardness) {
        this.hardness = hardness;
        return safeCast(this);
    }
    
    public T withResistance(float resistance) {
        this.resistance = resistance;
        return safeCast(this);
    }

    public T withModel(ModelBase model, String textureName) {
        this.model = model;
        this.textureName = textureName + ".png";
        return safeCast(this);
    }

    @Deprecated
    public T withModelClassName(String modelClassName) {
        this.modelClassName = modelClassName;
        return safeCast(this);
    }
    
    public T withPositioning(Consumer<TileEntity> positioning) {
        this.positioning = positioning;
        return safeCast(this);
    }
    
    public T withBoundingBox(Function<EnumFacing, AxisAlignedBB> boundingBox) {
        this.boundingBox = boundingBox;
        return safeCast(this);
    }
    
    public T withBoundingBox(double x1, double y1, double z1, double x2, double y2, double z2) {
    	AxisAlignedBB bb = new AxisAlignedBB(x1, y1, z1, x2, y2, z2);
        this.boundingBox = state -> bb;
        return safeCast(this);
    }

    public T notAProp() {
        prop = false;
        return safeCast(this);
    }

    public T modern() {
        modern = true;
        return safeCast(this);
    }

    public T withTransform(Transform transform) {
        this.transform = transform;
        return safeCast(this);
    }
    
    protected Class<? extends TileEntity> getBaseClass() {
        return CustomTileEntity.class;
    }
    
    
    protected Class<CustomTileEntity<T>> createTileEntityClass() {
        int modEntityId = entityIdSupplier.get();
        return (Class<CustomTileEntity<T>>) CustomTileEntityClassFactory.getInstance().generateEntitySubclass(
                getBaseClass(), modEntityId, this);
    }
    
    public void build(ModContext modContext) {
        
        Class<? extends TileEntity> tileEntityClass = createTileEntityClass();
        
        CustomTileEntityBlock tileEntityBlock = new CustomTileEntityBlock(material, tileEntityClass);
        if(!FMLCommonHandler.instance().getSide().isServer()) {
        	ClientEventHandler.BLANKMAPPED_LIST.add(tileEntityBlock);
        }
        tileEntityBlock.setTranslationKey(ID + "_" + name);
        tileEntityBlock.setHardness(hardness);
        tileEntityBlock.setResistance(resistance);
        tileEntityBlock.setCreativeTab(prop ? MWC.PROPS_TAB : creativeTab);
        tileEntityBlock.setBoundingBox(boundingBox);
        ResourceLocation textureResource = new ResourceLocation(ID, prop ? "textures/models/props/" + textureName : textureName);
        ResourceLocation tileEntity = new ResourceLocation(ID, "tile" + name);
        GameRegistry.registerTileEntity(tileEntityClass, tileEntity);

        if (tileEntityBlock.getRegistryName() == null) {
            if (tileEntityBlock.getTranslationKey().length() < ID.length() + 2 + 5) {
                throw new IllegalArgumentException("Unlocalize block name too short " + tileEntityBlock.getTranslationKey());
            }
            String unlocalizedName = tileEntityBlock.getTranslationKey().toLowerCase();
            String registryName = unlocalizedName.substring(5 + ID.length() + 1);
            tileEntityBlock.setRegistryName(ID, registryName);
        }

        ForgeRegistries.BLOCKS.register(tileEntityBlock);
        ItemBlock itemBlock = new ItemBlock(tileEntityBlock);
        // TODO: introduce registerItem()

        modContext.registerRenderableItem(tileEntityBlock.getRegistryName(), itemBlock, null);
        
        if(FMLCommonHandler.instance().getSide().isClient())
            RendererRegistration.registerRenderableEntity(modContext, name, tileEntityClass, "com.paneedah.mwc.models.props." + modelClassName, textureResource, positioning, tileEntityBlock, modern, transform, model);
    }
    
    private static class RendererRegistration {
        /*
         * This method is wrapped into a static class to facilitate conditional client-side only loading
         */
        private static <T extends CustomTileEntityConfiguration<T>> void registerRenderableEntity(ModContext context, String name, Class<? extends TileEntity> tileEntityClass, String modelClassName, ResourceLocation textureResource, Consumer<TileEntity> positioning, CustomTileEntityBlock tileEntityBlock, boolean modern, Transform transform, ModelBase model) {
            try {

//                MC.getRenderItem().getItemModelMesher()
//                    .register(Item.getItemFromBlock(tileEntityBlock), 0,
//                        new ModelResourceLocation(ID + ":" + name, "inventory"));
                
//                ModelResourceLocation itemModelResourceLocation = new ModelResourceLocation(ID + ":" + name, "inventory");
//                ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(tileEntityBlock), 0, itemModelResourceLocation);

                ClientRegistry.bindTileEntitySpecialRenderer(tileEntityClass, (TileEntitySpecialRenderer)new CustomTileEntityRenderer(model != null ? model : (ModelBase) Class.forName(modelClassName).newInstance(), textureResource, positioning, modern, transform));
                
            } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}
