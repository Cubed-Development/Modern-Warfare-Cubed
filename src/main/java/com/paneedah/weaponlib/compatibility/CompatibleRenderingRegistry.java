package com.paneedah.weaponlib.compatibility;

import com.paneedah.mwc.utils.ModReference;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelBakeEvent;
import net.minecraftforge.client.model.ICustomModelLoader;
import net.minecraftforge.client.model.IModel;
import net.minecraftforge.client.model.ModelLoaderRegistry;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

import static com.paneedah.mwc.proxies.ClientProxy.mc;

@Deprecated
public class CompatibleRenderingRegistry implements ICustomModelLoader {

	private List<ModelSourceRenderer> renderers = new ArrayList<>();
	private Set<String> modelSourceLocations = new HashSet<>();
	private List<Consumer<RenderItem>> delayedRegistrations = new ArrayList<>();

	public CompatibleRenderingRegistry() {
//		ModelLoaderRegistry.registerLoader(this);
//		{
//          Not needed anymore
//		    System.setProperty("fml.reloadResourcesOnStart", "true");
//		}
	}

	@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public void bakeModel(ModelBakeEvent event) {
		for(ModelSourceRenderer model: renderers) {
			event.getModelRegistry().putObject(model.getResourceLocation(), model);
		}
	}

	public void register(Item item, String name, Object renderer) {
	    if(renderer != null) {
	        renderers.add((ModelSourceRenderer) renderer);
	    }
		
		modelSourceLocations.add(ModReference.ID + ":models/item/" + name);
		ModelResourceLocation modelID = new ModelResourceLocation(ModReference.ID + ":" + name, "inventory");
		if(renderer != null) {
		    ((ModelSourceRenderer) renderer).setResourceLocation(modelID);
		}
		
		delayedRegistrations.add((renderItem) -> {
	        ItemModelMesher itemModelMesher = renderItem.getItemModelMesher();
	        itemModelMesher.register(item, 0, modelID);
		});
	}
	
	public void register(Item item, ResourceLocation name, Object renderer) {
	    // TODO: figure out what's going on with this name
        if(renderer != null) {
            renderers.add((ModelSourceRenderer) renderer);
            modelSourceLocations.add(ModReference.ID + ":models/item/" + name);
        }
        
        ModelResourceLocation modelID = new ModelResourceLocation(name, "inventory");
        if(renderer != null) {
            ((ModelSourceRenderer) renderer).setResourceLocation(modelID);
        }
        
        delayedRegistrations.add((renderItem) -> {
            ItemModelMesher itemModelMesher = renderItem.getItemModelMesher();
            itemModelMesher.register(item, 0, modelID);
        });
    }

	@Override
	public void onResourceManagerReload(IResourceManager resourceManager) {
	}

	@Override
	public boolean accepts(ResourceLocation modelLocation) {
		// Do not accept attachments
		return ModReference.ID.equals(modelLocation.getNamespace()) && modelSourceLocations.contains(modelLocation.toString());
	}

	@Override
	public IModel loadModel(ResourceLocation modelLocation) throws IOException {
		return ModelLoaderRegistry.getMissingModel();
	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	public void registerEntityRenderingHandler(Class<? extends Entity> class1,
	        Object spawnEntityRenderer) {
		RenderingRegistry.registerEntityRenderingHandler(class1, (Render<? extends Entity>) spawnEntityRenderer);
	}
	
	public void processDelayedRegistrations() {
        RenderItem renderItem = mc.getRenderItem();
        delayedRegistrations.forEach(r -> { r.accept(renderItem);});
        delayedRegistrations.clear();
    }

    public void preInit() {
        MinecraftForge.EVENT_BUS.register(this);
        ModelLoaderRegistry.registerLoader(this);
    }
}
