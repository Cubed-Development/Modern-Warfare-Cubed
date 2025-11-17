package com.paneedah.weaponlib.compatibility;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
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

}
