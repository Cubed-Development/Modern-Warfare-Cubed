package com.paneedah.weaponlib.ai;

public interface IEntityReload {

    int getAmmo();

    int getMaxAmmo();

    void setAmmo(int ammo);

    void setMaxAmmo(int maximumAmmo);

    int getReloadTime();

    void setReloadTime(int time);

}
