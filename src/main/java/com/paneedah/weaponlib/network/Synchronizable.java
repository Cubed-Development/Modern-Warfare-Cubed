package com.paneedah.weaponlib.network;

public interface Synchronizable<T, SyncContext> {

	public T sync(SyncContext context);
}
