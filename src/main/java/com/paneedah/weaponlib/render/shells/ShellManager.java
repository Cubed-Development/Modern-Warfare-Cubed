package com.paneedah.weaponlib.render.shells;

import com.paneedah.weaponlib.compatibility.CompatibleShellRenderer;
import com.paneedah.weaponlib.render.shells.ShellParticleSimulator.Shell;

import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Since the renderer and the physics are kept in separate classes, this helps
 * manage it.
 * 
 *
 */
public class ShellManager {

	private ShellParticleSimulator shellParticleSimulator = new ShellParticleSimulator();

	private ArrayList<Shell> shells = new ArrayList<Shell>();
	private LinkedBlockingQueue<Shell> shellQueue = new LinkedBlockingQueue<Shell>();

	public void enqueueShell(Shell shell) {
		
		shellQueue.add(shell);
		
	}
	
	public ArrayList<Shell> getShells() {
		return this.shells;
	}
	
	public void update(double dt) {
		for(int i = 0; i < shellQueue.size(); ++i) {
			shells.add(shellQueue.poll());
		}
		shellParticleSimulator.update(shells, dt);
	}

	public void render() {
		
		for(int i = 0; i < shellQueue.size(); ++i) {
			shells.add(shellQueue.poll());
		}
		if(shells.isEmpty()) return;
		

		CompatibleShellRenderer.render(shells);

	}

}
