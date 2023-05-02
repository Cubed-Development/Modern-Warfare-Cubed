package com.paneedah.mwc.weaponlib.render.qrender;

import com.paneedah.mwc.weaponlib.ModelRenderer;
import net.minecraft.client.model.ModelBase;

public class TRenderer extends ModelRenderer {

	public TRenderer(ModelBase model) {
		super(model);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void render(float scale) {
		long t1 = System.nanoTime();
		super.render(scale);
		long t2 = System.nanoTime();
		System.out.println("Time is " + (t2-t1) + " ns");
	}
	
	

}
