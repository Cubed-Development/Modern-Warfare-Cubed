package com.paneedah.mwc.weaponlib.compatibility;

public class RecoilParam {
	
	private double weaponPower, muzzleClimbDivisor, stockLength, powerRecoveryNormalRate, powerRecoveryStockRate, weaponRotationX, weaponRotationY, adsSimilarity;
	
	
	public RecoilParam() {
		this.weaponPower = 15;
		this.muzzleClimbDivisor = 25;
		this.stockLength = 50;
		this.powerRecoveryNormalRate = 0.9;
		this.powerRecoveryStockRate = 0.95;
		this.weaponRotationX = 0;
		this.weaponRotationY = 0;
		this.adsSimilarity = 1;
	}
	
	public RecoilParam(double weaponPower, double muzzleClimbDivisor, double stockLength, double prnr, double prnsr, double weaponRotX, double weaponRotY, double adsSimilarity) {
		this.weaponPower = weaponPower;
		this.muzzleClimbDivisor = muzzleClimbDivisor;
		this.stockLength = stockLength;
		this.powerRecoveryNormalRate = prnr;
		this.powerRecoveryStockRate = prnsr;
		this.weaponRotationX = weaponRotX;
		this.weaponRotationY = weaponRotY;
		this.adsSimilarity = 1.0 / adsSimilarity;
	}
	
	public double getWeaponPower() {
		return weaponPower;
	}

	public void setWeaponPower(double weaponPower) {
		this.weaponPower = weaponPower;
	}

	public double getMuzzleClimbDivisor() {
		return muzzleClimbDivisor;
	}

	public void setMuzzleClimbDivisor(double muzzleClimbDivisor) {
		this.muzzleClimbDivisor = muzzleClimbDivisor;
	}

	public double getStockLength() {
		return stockLength;
	}

	public void setStockLength(double stockLength) {
		this.stockLength = stockLength;
	}

	public double getPowerRecoveryNormalRate() {
		return powerRecoveryNormalRate;
	}

	public void setPowerRecoveryNormalRate(double powerRecoveryNormalRate) {
		this.powerRecoveryNormalRate = powerRecoveryNormalRate;
	}

	public double getPowerRecoveryStockRate() {
		return powerRecoveryStockRate;
	}

	public void setPowerRecoveryStockRate(double powerRecoveryStockRate) {
		this.powerRecoveryStockRate = powerRecoveryStockRate;
	}

	public double getWeaponRotationX() {
		return weaponRotationX;
	}

	public void setWeaponRotationX(double weaponRotationX) {
		this.weaponRotationX = weaponRotationX;
	}

	public double getWeaponRotationY() {
		return weaponRotationY;
	}

	public void setWeaponRotationY(double weaponRotationY) {
		this.weaponRotationY = weaponRotationY;
	}

	public double getADSSimilarity() {
		return this.adsSimilarity;
	}
	
	public void setADSSimilarity(double ads) {
		this.adsSimilarity = ads;
	}
	
	
	

}
