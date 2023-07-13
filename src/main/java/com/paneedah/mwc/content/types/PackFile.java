package com.paneedah.mwc.content.types;

import com.paneedah.mwc.utils.Checks;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class PackFile extends File {
    private String packName;
    private String packId;

    @Override
    public final PackFile[] listFiles() {
        File[] files = super.listFiles();
        List<PackFile> packFiles = new ArrayList<>();
        if(files == null) return null;
        for(File file : files)
            packFiles.add(new PackFile(file.getAbsolutePath()));
        return packFiles.toArray(new PackFile[0]);
    }

    public PackFile(String pack) {
        super(pack);
    }

    public String getPackName() {
        return packName;
    }

    public boolean setPackName(String name) {
        if(Checks.checkName(name)) {
            packName = name;
            return true;
        }
        return false;
    }

    public String getPackId() {
        return packId;
    }

    public boolean setPackId(String id) {
        if(Checks.checkId(id)) {
            packId = id.toLowerCase();
            return true;
        }
        return false;
    }
}
