package com.paneedah.weaponlib.ai;

public interface IEntityReload {

    public int getAmmo();

    public int getMaxAmmo();

    public void setAmmo(int ammo);

    public void setMaxAmmo(int maximumAmmo);

    public int getReloadTime();

    public void setReloadTime(int time);

}
