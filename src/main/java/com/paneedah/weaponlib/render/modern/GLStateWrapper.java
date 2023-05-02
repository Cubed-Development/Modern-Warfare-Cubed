package com.paneedah.weaponlib.render.modern;

public class GLStateWrapper {
	
	private Runnable loadState;
	private Runnable releaseState;
	
	public GLStateWrapper(Runnable loadState, Runnable releaseState) {
		this.loadState = loadState;
		this.releaseState = releaseState;
	}
	
	public void run(Runnable state) {
		loadState.run();
		state.run();
		releaseState.run();
	}
	
	public static void run(Runnable setupState, Runnable releaseState, Runnable run) {
		setupState.run();
		run.run();
		releaseState.run();
	}

}
