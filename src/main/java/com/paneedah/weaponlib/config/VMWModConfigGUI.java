package com.paneedah.weaponlib.config;

import com.paneedah.mwc.utils.ModReference;
import com.paneedah.weaponlib.config.HierarchialTree.Branch;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.Config.RangeDouble;
import net.minecraftforge.common.config.Config.RangeInt;
import net.minecraftforge.common.config.Config.RequiresMcRestart;
import net.minecraftforge.fml.client.config.ConfigGuiType;
import net.minecraftforge.fml.client.config.GuiConfig;
import net.minecraftforge.fml.client.config.IConfigElement;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public class VMWModConfigGUI extends GuiConfig {
	
	private static final HierarchialTree<IConfigElement> configTree = new HierarchialTree<>();
	private static final List<IConfigElement> cachedList = new ArrayList<>();
	private static boolean shouldUpdateCache = true;
	
	public VMWModConfigGUI(GuiScreen parentScreen) {
		super(parentScreen, getElements(), ModReference.ID, false, false, "Finally... a config!");
	}

	public static ConfigGuiType getGUITypeFromFieldType(Field f) {
		if(f.getType() == int.class) {
			return ConfigGuiType.INTEGER;
		} else if(f.getType() == boolean.class) {
			return ConfigGuiType.BOOLEAN;
		} else if(f.getType() == double.class) {
			return ConfigGuiType.DOUBLE;
		} else if(f.getType() == String.class) {
			return ConfigGuiType.STRING;
		} 
		return null;
	}
	
	protected static void submitField(ConfigSync annotation, Field f) {
		String propertyTag = "config." + annotation.category() + "." + f.getName() + ".property";
		
		try {
			SynchronizedConfigElement element = null;

			if(f.getType() == int.class) {
				if(f.isAnnotationPresent(RangeInt.class)) {
					// Is ranged
					RangeInt range = f.getAnnotation(RangeInt.class);
					element = new SynchronizedConfigElement(f, f.getName(), propertyTag + ".name", f.get(null), getGUITypeFromFieldType(f), propertyTag, range.min(), range.max());
				}

			} else if(f.getType() == double.class) {
				if(f.isAnnotationPresent(RangeDouble.class)) {
					// Is ranged
					RangeDouble range = f.getAnnotation(RangeDouble.class);
					element = new SynchronizedConfigElement(f, f.getName(), propertyTag + ".name", f.get(null), getGUITypeFromFieldType(f), propertyTag, range.min(), range.max());
				}
			}
			
			// If no element yet, make an element w/ the standard method
			if(element == null)
				element = new SynchronizedConfigElement(f, f.getName(), propertyTag + ".name", f.get(null), getGUITypeFromFieldType(f), propertyTag);
			
			if(f.isAnnotationPresent(RequiresMcRestart.class))
				element.setRequiresMcRestart(true);
			
			// Insert element into tree
			configTree.addNode(annotation.category(), element);
		
			
		} catch(IllegalArgumentException | IllegalAccessException ignored) {}
	}
	


	
	private static void recursiveWalk(Branch<IConfigElement> branch, ModernConfigCategory element) {
		String[] splitted = branch.getPathway().split("\\.");
		String name = splitted[splitted.length-1];
		
		if(!element.getCategoryName().equals(name)) {
			ModernConfigCategory newElement = new ModernConfigCategory(name, "config.category." + name, new ArrayList<>());
			element.getChildElements().add(newElement);
			element = newElement;
		}
		
		Iterator<IConfigElement> nodeIterator = branch.getNodeIterator();
		while(nodeIterator.hasNext()) {
			element.getChildElements().add(nodeIterator.next());
		}
		
		for(Entry<String, Branch<IConfigElement>> entry : branch.getSubBranches().entrySet())
			recursiveWalk(entry.getValue(), element);
	}
	
	
	public static List<IConfigElement> getElements() {
		ModernConfigManager.init();

		if(shouldUpdateCache) {
			// Set up caching
			cachedList.clear();
			shouldUpdateCache = false;
			
			Iterator<Branch<IConfigElement>> itr = configTree.getRootIterator();
			while(itr.hasNext()) {
				
				// Get current root
				Branch<IConfigElement> root = itr.next();

				// Add the root category
				ModernConfigCategory category = new ModernConfigCategory(root.getKey(), "config.category." + root.getKey(), new ArrayList<>());
				cachedList.add(category);
				
				// Begin recursive walk
				recursiveWalk(root, category);
			}
		}

		return cachedList;
	}
	
	@Override
	public void onGuiClosed() {
		ModernConfigManager.saveConfig();
		super.onGuiClosed();
	}
	
	@Override
	public void initGui() {
		super.initGui();
	}
	
	@Override
	public void drawScreen(int mouseX, int mouseY, float partialTicks) {
		super.drawScreen(mouseX, mouseY, partialTicks);
	}

	@Override
	protected void actionPerformed(GuiButton button) {
		super.actionPerformed(button);
	}
}
