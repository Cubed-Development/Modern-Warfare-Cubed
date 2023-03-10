package com.paneedah.weaponlib.config;

import com.paneedah.weaponlib.config.novel.VMWModConfigGUI;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.fml.client.IModGuiFactory;

import java.util.Set;

public class ConfigGUIFactory implements IModGuiFactory {

	@Override
	public void initialize(Minecraft minecraftInstance) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean hasConfigGui() {
		return true;
	}

	@Override
	public GuiScreen createConfigGui(GuiScreen parentScreen) {
		return new VMWModConfigGUI(parentScreen);
	}

	@Override
	public Set<RuntimeOptionCategoryElement> runtimeGuiCategories() {
		// TODO Auto-generated method stub
		return null;
	}
	


}
