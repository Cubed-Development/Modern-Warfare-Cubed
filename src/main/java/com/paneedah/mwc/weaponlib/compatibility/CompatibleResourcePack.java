package com.paneedah.mwc.weaponlib.compatibility;

import net.minecraft.client.resources.IResourcePack;
import net.minecraft.client.resources.data.IMetadataSection;
import net.minecraft.client.resources.data.MetadataSerializer;

import java.io.IOException;
import java.util.Set;

public abstract class CompatibleResourcePack implements IResourcePack {

	@Override
	public final Set<String> getResourceDomains() {
		return getCompatibleResourceDomains();
	}

	protected abstract Set<String> getCompatibleResourceDomains();

	@Override
	public <T extends IMetadataSection> T getPackMetadata(MetadataSerializer metadataSerializer,
			String metadataSectionName) throws IOException {
		return null;
	}


}
