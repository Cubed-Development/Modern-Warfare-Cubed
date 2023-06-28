package com.paneedah.weaponlib.tile;

import com.paneedah.mwc.utils.ModReference;
import com.paneedah.weaponlib.ClientEventHandler;
import com.paneedah.weaponlib.ModContext;
import com.paneedah.weaponlib.jim.util.VMWHooksHandler;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class CustomTileEntityConfiguration<T extends CustomTileEntityConfiguration<T>> {
    
    private Material material;
    private String name;
    private String textureName;
    private CreativeTabs creativeTab;
    private float hardness = 6f;
    private float resistance = 600000f;
    private String modelClassName;
    private AtomicInteger counter = new AtomicInteger(10000);
    private Supplier<Integer> entityIdSupplier = () -> counter.incrementAndGet();
    private Consumer<TileEntity> positioning = tileEntity -> {};
    private Function<IBlockState, AxisAlignedBB> boundingBox;
    
    @SuppressWarnings("unchecked")
    private T safeCast(CustomTileEntityConfiguration<T> input) {
        return (T) input;
    }

    public T withMaterial(Material material) {
        this.material = material;
        return safeCast(this);
    }
    
    public T withName(String name) {
        this.name = name;
        return safeCast(this);
    }
    
    public T withTextureName(String textureName) {
        this.textureName = textureName;
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
    
    public T withModelClassName(String modelClassName) {
        this.modelClassName = modelClassName;
        return safeCast(this);
    }
    
    public T withPositioning(Consumer<TileEntity> positioning) {
        this.positioning = positioning;
        return safeCast(this);
    }
    
    public T withBoundingBox(Function<IBlockState, AxisAlignedBB> boundingBox) {
        this.boundingBox = boundingBox;
        return safeCast(this);
    }
    
    public T withBoundingBox(double x1, double y1, double z1, double x2, double y2, double z2) {
    	AxisAlignedBB bb = new AxisAlignedBB(x1, y1, z1, x2, y2, z2);
        this.boundingBox = state -> bb;
        return safeCast(this);
    }
    
    protected Class<? extends TileEntity> getBaseClass() {
        return CustomTileEntity.class;
    }
    
    @SuppressWarnings("unchecked")
    protected Class<CustomTileEntity<T>> createTileEntityClass() {
        int modEntityId = entityIdSupplier.get();
        return (Class<CustomTileEntity<T>>) CustomTileEntityClassFactory.getInstance().generateEntitySubclass(
                getBaseClass(), modEntityId, this);
    }
    
    public void build(ModContext modContext) {
        
        Class<? extends TileEntity> tileEntityClass = createTileEntityClass();
        
        CustomTileEntityBlock tileEntityBlock = new CustomTileEntityBlock(material, tileEntityClass);
        if(!VMWHooksHandler.isOnServer()) {
        	ClientEventHandler.BLANKMAPPED_LIST.add(tileEntityBlock);
        }
        tileEntityBlock.setTranslationKey(ModReference.ID + "_" + name);
        tileEntityBlock.setHardness(hardness);
        tileEntityBlock.setResistance(resistance);
        tileEntityBlock.setCreativeTab(creativeTab);
        tileEntityBlock.setBoundingBox(boundingBox);
        ResourceLocation textureResource = new ResourceLocation(ModReference.ID, textureName);
        GameRegistry.registerTileEntity(tileEntityClass, "tile" + name);
        
        //System.out.println("RUNNING!");

        if (tileEntityBlock.getRegistryName() == null) {
            if (tileEntityBlock.getTranslationKey().length() < ModReference.ID.length() + 2 + 5) {
                throw new IllegalArgumentException("Unlocalize block name too short " + tileEntityBlock.getTranslationKey());
            }
            String unlocalizedName = tileEntityBlock.getTranslationKey().toLowerCase();
            String registryName = unlocalizedName.substring(5 + ModReference.ID.length() + 1);
            tileEntityBlock.setRegistryName(ModReference.ID, registryName);
        }

        ForgeRegistries.BLOCKS.register(tileEntityBlock);
        ItemBlock itemBlock = new ItemBlock(tileEntityBlock);
        // TODO: introduce registerItem()

        modContext.registerRenderableItem(tileEntityBlock.getRegistryName(), itemBlock, null);
        
        if(FMLCommonHandler.instance().getSide() == Side.CLIENT) {
            RendererRegistration.registerRenderableEntity(modContext, name, tileEntityClass, modelClassName, 
                    textureResource, positioning, tileEntityBlock);
        }
    }
    
    private static class RendererRegistration {
        /*
         * This method is wrapped into a static class to facilitate conditional client-side only loading
         */
        private static <T extends CustomTileEntityConfiguration<T>> void registerRenderableEntity(
                ModContext context, String name, Class<? extends TileEntity> tileEntityClass, String modelClassName, 
                ResourceLocation textureResource, Consumer<TileEntity> positioning, CustomTileEntityBlock tileEntityBlock) {
            try {

//                mc.getRenderItem().getItemModelMesher()
//                    .register(Item.getItemFromBlock(tileEntityBlock), 0,
//                        new ModelResourceLocation(ModReference.id + ":" + name, "inventory"));
                
//                ModelResourceLocation itemModelResourceLocation = new ModelResourceLocation(ModReference.id + ":" + name, "inventory");
//                ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(tileEntityBlock), 0, itemModelResourceLocation);
                
                ModelBase model = (ModelBase) Class.forName(modelClassName).newInstance();
                ClientRegistry.bindTileEntitySpecialRenderer(tileEntityClass, (TileEntitySpecialRenderer)new CustomTileEntityRenderer(model, textureResource, positioning));
                
            } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}
