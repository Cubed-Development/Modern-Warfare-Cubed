package com.paneedah.weaponlib.compatibility;

import lombok.Getter;
import lombok.Setter;

public class RecoilParam {

    @Getter
    @Getter
    @Getter
    @Getter
    @Getter
    @Getter
    @Getter
    @Setter
    @Setter
    @Setter
    @Setter
    @Setter
    @Setter
    @Setter
    private double weaponPower, muzzleClimbDivisor, stockLength, powerRecoveryNormalRate, powerRecoveryStockRate, weaponRotationX, weaponRotationY, adsSimilarity;


    public RecoilParam() {
        weaponPower = 15;
        muzzleClimbDivisor = 25;
        stockLength = 50;
        powerRecoveryNormalRate = 0.9;
        powerRecoveryStockRate = 0.95;
        weaponRotationX = 0;
        weaponRotationY = 0;
        adsSimilarity = 1;
    }

    public RecoilParam(double weaponPower, double muzzleClimbDivisor, double stockLength, double prnr, double prnsr, double weaponRotX, double weaponRotY, double adsSimilarity) {
        this.weaponPower = weaponPower;
        this.muzzleClimbDivisor = muzzleClimbDivisor;
        this.stockLength = stockLength;
        powerRecoveryNormalRate = prnr;
        powerRecoveryStockRate = prnsr;
        weaponRotationX = weaponRotX;
        weaponRotationY = weaponRotY;
        this.adsSimilarity = 1.0 / adsSimilarity;
    }

    public double getADSSimilarity() {
        return adsSimilarity;
    }

    public void setADSSimilarity(double ads) {
        adsSimilarity = ads;
    }


}
