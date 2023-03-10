package com.paneedah.weaponlib.numerical;

public class SynchronizedSimulator {
	
	private ISimulator simulator;
	private long previousFrameTime = System.currentTimeMillis();
	private double accumulator;
	private double dt;
	
	private double remainder;
	
	public SynchronizedSimulator(ISimulator simulator, double dt) {
		this.simulator = simulator;
		this.dt = dt;
	}
	
	public void update() {
		
		long newTime = System.currentTimeMillis();
		double frameTime = (newTime - previousFrameTime)/1000.0;
		previousFrameTime = newTime;
		
		if(frameTime > 0.25) frameTime = 0.25;
		
		accumulator += frameTime;
		
		while(accumulator >= dt) {
			//System.out.println("hi");
			simulator.update(dt);
			accumulator -= dt;
		}
		
		this.remainder = accumulator;
		
		
		
	}
	
	public double getRemainder() {
		return this.remainder;
	}
	
	

}
